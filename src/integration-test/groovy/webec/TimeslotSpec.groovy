package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class TimeslotSpec extends GebSpec {

    void "site navigation timeslot"() {
        when:
        go '/timeslot/index'

        then:
        title == "Timeslot Liste"

        when:
        go '/timeslot/create'

        then:
        title == "Timeslot anlegen"

    }

}
