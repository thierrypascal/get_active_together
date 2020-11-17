package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

import java.sql.Time

class TimeslotSpec extends Specification implements DomainUnitTest<Person> {

    void "Timeslot can be created"() {
        given: "a timeslot"
            Timeslot t1 = new Timeslot(date: new Date(), timeslot: Timeslot.PM1) //blank is not allowed
        expect:"can read date and timeslot"
            t1.date == new Date()
            t1.timeslot == "13:00"
    }
}
