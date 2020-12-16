package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class PersonSpec extends GebSpec {

    void "site navigation person"() {
        when:
            go '/person/index'

        then:
            title == "Person Liste"

        when:
            go '/person/create'

        then:
            title == "Person anlegen"

    }

}
