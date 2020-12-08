package webec

class LocationController {

    static scaffold = Location

    LocationService locationService

    def show(Long id) {

        Location location = Location.findById(id)
        List<Meetup> showAllMeetupsOfLocation = Meetup.findAllByLocation(location)
        List<Person> showAllPerson = new ArrayList<>()
        if (showAllMeetupsOfLocation != null){
            showAllMeetupsOfLocation.forEach({ loc -> showAllPerson.add(loc.getPerson()) })
        }

        respond locationService.get(id), model: [showAllPerson:showAllPerson]
    }

}
