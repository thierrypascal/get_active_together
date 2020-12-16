package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class LocationSpec extends GebSpec {

    void "site navigation location"() {
        when:
        go '/location/index'

        then:
        title == "Location Liste"

        when:
        go '/location/create'

        then:
        title == "Location anlegen"

    }

}
