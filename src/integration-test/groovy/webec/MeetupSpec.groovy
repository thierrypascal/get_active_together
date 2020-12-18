package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class MeetupSpec extends GebSpec {

    void "site navigation meetup"() {
        when:
        go '/meetup/create'

        then:
        title == "Meetup anlegen"
    }

    void "security setting: only logged in user (admin) can access meetup/index"() {
        // Uncomment this block if security is on
        when:
        go '/meetup/index'

        then:
        title == "Anmeldung"

        /*  Uncomment this block if security is off
        when:
            go '/meetup/index'

        then:
            title == "Meetup Liste"

        */
    }

    void "security setting: only logged in user (admin) can access meetup/admin"() {
        // Uncomment this block if security is on
        when:
        go '/meetup/admin'

        then:
        title == "Anmeldung"

        /*  Uncomment this block if security is off
        when:
            go '/meetup/admin'

        then:
            title == "Admin-Page"

        */
    }
}
