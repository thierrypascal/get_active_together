package webec

import static org.springframework.http.HttpStatus.NO_CONTENT

class MeetupController {

    static scaffold = Meetup

    MeetupService meetupService

    def test(){
        Person person = Person.findByFirstName("Thierry")
        List<Meetup> meetups = Meetup.findAllByPerson(person)

        def result = meetups.location

        render result
    }

    def admin(){}

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        meetupService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'meetup.label', default: 'Meetup'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

}
