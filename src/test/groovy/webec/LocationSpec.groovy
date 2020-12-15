package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class LocationSpec extends Specification implements DomainUnitTest<Location> {

    void "Location can be created"() {
        given: "a location"
            Location l1 = new Location(title: "TestLocation", coordinates: "47.559, 7.954", activity: Location.act4)
        expect:"can read title, description, coordinates and activity"
            l1.title == "TestLocation"
            l1.coordinates == "47.559, 7.954"
            l1.activity == "Cycling"
    }
}
