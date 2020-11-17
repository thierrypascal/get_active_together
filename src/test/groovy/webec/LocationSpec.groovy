package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class LocationSpec extends Specification implements DomainUnitTest<Person> {

    void "Location can be created"() {
        given: "a location"
            Location l1 = new Location(title: "TestLocation", description: "Short description", coordinates: "47.559, 7.954", activity: Location.act4)  //description is allowed to be null
        expect:"can read title, description, coordinates and activity"
            l1.title == "TestLocation"
            l1.description == "Short description"
            l1.coordinates == "47.559, 7.954"
            l1.activity == "Cycling"
    }
}
