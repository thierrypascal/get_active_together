package webec

class PersonController {

    static scaffold = Person

    PersonService personService

    def show(Long id) {

        Person person = Person.findByFirstNameAndLastName(personService.get(id).getFirstName(), personService.get(id).getLastName())
        List<Meetup> showMyMeetups = Meetup.findAllByPerson(person)

        respond personService.get(id), model: [showMyMeetups:showMyMeetups]
    }
}
