package webec

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonControllerSpec extends Specification implements DomainUnitTest<Person> {

    void "Person can be created"() {
        given: "a person"
            Person p1 = new Person(firstName: "Thierry", lastName: "Odermatt" ) //blank is not allowed
        expect:"can read first and last name"
            p1.firstName == "Thierry"
            p1.lastName == "Odermatt"
    }
}
