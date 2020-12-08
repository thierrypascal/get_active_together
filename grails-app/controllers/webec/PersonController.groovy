package webec

class PersonController {

    static scaffold = Person

    PersonService personService

    def show(Long id) {

        Person person = Person.findById(id)
        List<Meetup> showMyMeetups = Meetup.findAllByPerson(person)

        respond personService.get(id), model: [showMyMeetups:showMyMeetups]
    }
}
