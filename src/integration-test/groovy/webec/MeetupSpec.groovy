package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class MeetupSpec extends GebSpec {

    void "site navigation meetup"() {
        when:
        go '/meetup/index'

        then:
        title == "Meetup Liste"

        when:
        go '/meetup/create'

        then:
        title == "Meetup anlegen"

    }

}
