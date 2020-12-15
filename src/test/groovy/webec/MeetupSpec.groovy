package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class MeetupSpec extends Specification implements DomainUnitTest<Meetup> {

    void "Meetup can be created"() {
        given: "a location, a timeslot, a person to create a meetup"
            Date d = new Date()
            Location l1 = new Location(title: "TestLocation", coordinates: "47.559, 7.954", activity: Location.act4)
            Timeslot t1 = new Timeslot(date: d, timeslot: Timeslot.PM1)
            Person p1 = new Person(firstName: "Thierry", lastName: "Odermatt" )

            Meetup m1 = new Meetup(location: l1, timeslot: t1, person: p1)
        expect: "can read properties of location, timeslot, person of meetup"
            m1.location.title == "TestLocation"
            m1.timeslot.timeslot == "13:00"
            m1.person.firstName == "Thierry"
    }
}
