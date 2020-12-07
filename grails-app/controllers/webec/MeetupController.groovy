package webec

class MeetupController {

    static scaffold = Meetup

    def test(){
        Person person = Person.findByFirstName("Thierry")
        List<Meetup> meetups = Meetup.findAllByPerson(person)

        def result = meetups.location

        render result
    }

    def admin(){}

    def myMeetups(){
        Person person = Person.findByFirstNameAndLastName(params.pre, params.last)
        List<Meetup> myMeetups = Meetup.findAllByPerson(person)

        [myMeetups:myMeetups]
    }
}
