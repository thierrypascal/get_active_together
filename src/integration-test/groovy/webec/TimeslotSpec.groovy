package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class TimeslotSpec extends GebSpec {

    void "create timeslot"() {
        when:
        go '/timeslot/create'

        then:
        title == "Timeslot anlegen"


    }

}
