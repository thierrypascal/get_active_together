package webec

import grails.rest.Resource

@Resource(uri="/meetups")
class Meetup {

    Location location
    Timeslot timeslot
    Person person

    static constraints = {
        location nullable: false
        timeslot nullable: false
        person nullable: false
    }
}
