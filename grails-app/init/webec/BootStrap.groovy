package webec

class BootStrap {

    def init = { servletContext ->

        Location l1 = new Location(title: "Grillstelle Güggelchrüz", coordinates: "47.519046, 7.538752", activity: Location.act1).save()
        Location l2 = new Location(title: "Grillstelle Güggelchrüz", coordinates: "47.519046, 7.538752", activity: Location.act2).save()
        Location l3 = new Location(title: "Grillstelle Güggelchrüz", coordinates: "47.519046, 7.538752", activity: Location.act3).save()
        Location l4 = new Location(title: "Grillstelle Güggelchrüz", coordinates: "47.519046, 7.538752", activity: Location.act5).save()
        Location l5 = new Location(title: "Hüslimatt", coordinates: "47.510326, 7.558631", activity: Location.act1).save()
        Location l6 = new Location(title: "Hüslimatt", coordinates: "47.510326, 7.558631", activity: Location.act2).save()
        Location l7 = new Location(title: "Hüslimatt", coordinates: "47.510326, 7.558631", activity: Location.act3).save()
        Location l8 = new Location(title: "Hüslimatt", coordinates: "47.510326, 7.558631", activity: Location.act4).save()
        Location l9 = new Location(title: "Bim Wyss", coordinates: "47.511711, 7.555675", activity: Location.act2).save()
        Location l10 = new Location(title: "Schiessstand Therwil", coordinates: "47.506746, 7.562740", activity: Location.act1).save()
        Location l11 = new Location(title: "Schiessstand Therwil", coordinates: "47.506746, 7.562740", activity: Location.act2).save()
        Location l12 = new Location(title: "Schiessstand Therwil", coordinates: "47.506746, 7.562740", activity: Location.act3).save()
        Location l13 = new Location(title: "Schiessstand Therwil", coordinates: "47.506746, 7.562740", activity: Location.act5).save()
        Location l15 = new Location(title: "Ettingen Bahnhof", coordinates: "47.483660, 7.546211", activity: Location.act1).save()
        Location l16 = new Location(title: "Ettingen Bahnhof", coordinates: "47.483660, 7.546211", activity: Location.act2).save()
        Location l17 = new Location(title: "Ettingen Bahnhof", coordinates: "47.483660, 7.546211", activity: Location.act3).save()
        Location l18 = new Location(title: "Ettingen Bahnhof", coordinates: "47.483660, 7.546211", activity: Location.act4).save()
        Location l19 = new Location(title: "Ettingen Bahnhof", coordinates: "47.483660, 7.546211", activity: Location.act5).save()
        Location l20 = new Location(title: "Challpass", coordinates: "47.450713, 7.458572", activity: Location.act1).save()
        Location l21 = new Location(title: "Challpass", coordinates: "47.450713, 7.458572", activity: Location.act5).save()
        Location l22 = new Location(title: "Mariastein", coordinates: "47.476557, 7.490089", activity: Location.act1).save()
        Location l23 = new Location(title: "Mariastein", coordinates: "47.476557, 7.490089", activity: Location.act2).save()
        Location l24 = new Location(title: "Basel Heuwaage", coordinates: "47.551032, 7.587806", activity: Location.act1).save()
        Location l25 = new Location(title: "Basel Wettsteinplatz", coordinates: "47.559121, 7.598543", activity: Location.act1).save()
        Location l26 = new Location(title: "Basel Rheinufer", coordinates: "47.560595, 7.590789", activity: Location.act2).save()
        Location l27 = new Location(title: "Basel Rheinufer", coordinates: "47.560595, 7.590789", activity: Location.act3).save()
        Location l28 = new Location(title: "Muttenz Hinterer Wartenberg", coordinates: "47.523929, 7.658352", activity: Location.act1).save()
        Location l29 = new Location(title: "Muttenz Hinterer Wartenberg", coordinates: "47.523929, 7.658352", activity: Location.act2).save()
        Location l30 = new Location(title: "Muttenz Hinterer Wartenberg", coordinates: "47.523929, 7.658352", activity: Location.act4).save()
        Location l31 = new Location(title: "Muttenz Hinterer Wartenberg", coordinates: "47.523929, 7.658352", activity: Location.act5).save()
        Location l32 = new Location(title: "Bike Trail Arlesheim", coordinates: "47.503153, 7.623856", activity: Location.act5).save()
        Location l33 = new Location(title: "Gempen Nord Trail", coordinates: "47.507360, 7.643177", activity: Location.act5).save()
        Location l34 = new Location(title: "Gempen Kreuzung", coordinates: "47.472899, 7.658501", activity: Location.act1).save()
        Location l35 = new Location(title: "Gempen Kreuzung", coordinates: "47.472899, 7.658501", activity: Location.act2).save()
        Location l36 = new Location(title: "Gempen Kreuzung", coordinates: "47.472899, 7.658501", activity: Location.act4).save()
        Location l37 = new Location(title: "Gempen Kreuzung", coordinates: "47.472899, 7.658501", activity: Location.act5).save()


        Date today = new Date()
        Timeslot t1 = new Timeslot(date: today, timeslot: Timeslot.AM1).save()
        Timeslot t2 = new Timeslot(date: today, timeslot: Timeslot.AM2).save()
        Timeslot t3 = new Timeslot(date: today, timeslot: Timeslot.PM1).save()
        Timeslot t4 = new Timeslot(date: today, timeslot: Timeslot.PM2).save()
        Timeslot t5 = new Timeslot(date: today, timeslot: Timeslot.PM3).save()

        Person p1 = new Person(firstName: "Thierry", lastName: "Odermatt").save()
        Person p2 = new Person(firstName: "Alex", lastName: "Odermatt").save()

        Meetup m1 = new Meetup(location: l1, timeslot: t3, person: p1).save()
        Meetup m2 = new Meetup(location: l3, timeslot: t5, person: p1).save()
        Meetup m3 = new Meetup(location: l3, timeslot: t5, person: p2).save()
        Meetup m4 = new Meetup(location: l2, timeslot: t1, person: p2).save()
        Meetup m5 = new Meetup(location: l1, timeslot: t2, person: p1).save()

    }
    def destroy = {
    }
}
