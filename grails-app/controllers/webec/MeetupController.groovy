package webec

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.NO_CONTENT

class MeetupController {

    static scaffold = Meetup

    MeetupService meetupService

    @Secured(SecRole.ADMIN)
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
                redirect controller:"person", action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

}
