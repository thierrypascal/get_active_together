package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class PersonSpec extends GebSpec {

    void "create person"() {
        when:
            go '/person/create'

        then:
            title == "Person anlegen"

    }
}
