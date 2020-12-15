package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

import java.sql.Time

class TimeslotSpec extends Specification implements DomainUnitTest<Timeslot> {

    void "Timeslot can be created"() {
        given: "a timeslot"
            Date d = new Date()
            Timeslot t1 = new Timeslot(date: d, timeslot: Timeslot.PM1) //blank is not allowed
        expect:"can read date and timeslot"
            t1.date == d
            t1.timeslot == "13:00"
    }
}
