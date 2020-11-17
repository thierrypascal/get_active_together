package webec

class BootStrap {

    def init = { servletContext ->

        Person p1 = new Person(firstName: "Thierry", lastName: "Odermatt").save()
        Person p2 = new Person(firstName: "Alex", lastName: "Odermatt").save()

        Location l1 = new Location(title: "Ort1", description: "", coordinates: "1.1", activity: Location.act1).save()
        Location l2 = new Location(title: "Ort2", description: "", coordinates: "1.2", activity: Location.act2).save()
        Location l3 = new Location(title: "Ort3", description: "", coordinates: "1.3", activity: Location.act5).save()

        Date today = new Date()
        Timeslot t1 = new Timeslot(date: today, timeslot: Timeslot.AM1).save()
        Timeslot t2 = new Timeslot(date: today, timeslot: Timeslot.AM2).save()
        Timeslot t3 = new Timeslot(date: today, timeslot: Timeslot.PM1).save()
        Timeslot t4 = new Timeslot(date: today, timeslot: Timeslot.PM2).save()
        Timeslot t5 = new Timeslot(date: today, timeslot: Timeslot.PM3).save()

        Meetup m1 = new Meetup(location: l1, timeslot: t3, person: p1).save()
        Meetup m2 = new Meetup(location: l3, timeslot: t5, person: p2).save()

    }
    def destroy = {
    }
}
