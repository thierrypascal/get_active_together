package webec

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class LocationSpec extends GebSpec {

    void "create location"() {
        when:
        go '/location/create'

        then:
        title == "Location anlegen"


    }

}
