package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class MeetupSpec extends GebSpec {

    void "create meetup"() {
        when:
        go '/meetup/create'

        then:
        title == "Meetup anlegen"


    }

}
