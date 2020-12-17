package webec

import grails.util.Environment
import org.codehaus.groovy.runtime.DateGroovyMethods

class BootStrap {

    def init = { servletContext ->
        //SecUser
        SecRole adminRole = save(SecRole.findOrCreateWhere(authority: SecRole.ADMIN))

        if (Environment.current != Environment.DEVELOPMENT) { // guard clause
            return;
        }

        SecUser testUser  = save(new SecUser(username: 'admin',      password: 'admin'))

        testUser.withTransaction { tx ->
            SecUserSecRole.create(testUser, adminRole, true)
        }

        // plausibility check
        assert SecRole.count()          == 1
        assert SecUser.count()          == 1
        assert SecUserSecRole.count()   == 1


        //all locations
        Location l1  = new Location(title: "Grillstelle Güggelchrüz",       latitude: 47.519046, longitude: 7.538752,     activity: Location.act1).save()
        Location l2  = new Location(title: "Grillstelle Güggelchrüz",       latitude: 47.519046, longitude: 7.538752,     activity: Location.act2).save()
        Location l3  = new Location(title: "Grillstelle Güggelchrüz",       latitude: 47.519046, longitude: 7.538752,     activity: Location.act3).save()
        Location l4  = new Location(title: "Grillstelle Güggelchrüz",       latitude: 47.519046, longitude: 7.538752,     activity: Location.act5).save()
        Location l5  = new Location(title: "Hüslimatt",                     latitude: 47.510326, longitude: 7.558631,     activity: Location.act1).save()
        Location l6  = new Location(title: "Hüslimatt",                     latitude: 47.510326, longitude: 7.558631,     activity: Location.act2).save()
        Location l7  = new Location(title: "Hüslimatt",                     latitude: 47.510326, longitude: 7.558631,     activity: Location.act3).save()
        Location l8  = new Location(title: "Hüslimatt",                     latitude: 47.510326, longitude: 7.558631,     activity: Location.act4).save()
        Location l9  = new Location(title: "Bim Wyss",                      latitude: 47.511711, longitude: 7.555675,     activity: Location.act2).save()
        Location l10 = new Location(title: "Schiessstand Therwil",          latitude: 47.506746, longitude: 7.562740,     activity: Location.act1).save()
        Location l11 = new Location(title: "Schiessstand Therwil",          latitude: 47.506746, longitude: 7.562740,     activity: Location.act2).save()
        Location l12 = new Location(title: "Schiessstand Therwil",          latitude: 47.506746, longitude: 7.562740,     activity: Location.act3).save()
        Location l13 = new Location(title: "Schiessstand Therwil",          latitude: 47.506746, longitude: 7.562740,     activity: Location.act5).save()
        Location l15 = new Location(title: "Ettingen Bahnhof",              latitude: 47.483660, longitude: 7.546211,     activity: Location.act1).save()
        Location l16 = new Location(title: "Ettingen Bahnhof",              latitude: 47.483660, longitude: 7.546211,     activity: Location.act2).save()
        Location l17 = new Location(title: "Ettingen Bahnhof",              latitude: 47.483660, longitude: 7.546211,     activity: Location.act3).save()
        Location l18 = new Location(title: "Ettingen Bahnhof",              latitude: 47.483660, longitude: 7.546211,     activity: Location.act4).save()
        Location l19 = new Location(title: "Ettingen Bahnhof",              latitude: 47.483660, longitude: 7.546211,     activity: Location.act5).save()
        Location l20 = new Location(title: "Challpass",                     latitude: 47.450713, longitude: 7.458572,     activity: Location.act1).save()
        Location l21 = new Location(title: "Challpass",                     latitude: 47.450713, longitude: 7.458572,     activity: Location.act5).save()
        Location l22 = new Location(title: "Mariastein",                    latitude: 47.476557, longitude: 7.490089,     activity: Location.act1).save()
        Location l23 = new Location(title: "Mariastein",                    latitude: 47.476557, longitude: 7.490089,     activity: Location.act2).save()
        Location l24 = new Location(title: "Basel Heuwaage",                latitude: 47.551032, longitude: 7.587806,     activity: Location.act1).save()
        Location l25 = new Location(title: "Basel Wettsteinplatz",          latitude: 47.559121, longitude: 7.598543,     activity: Location.act1).save()
        Location l26 = new Location(title: "Basel Rheinufer",               latitude: 47.560595, longitude: 7.590789,     activity: Location.act2).save()
        Location l27 = new Location(title: "Basel Rheinufer",               latitude: 47.560595, longitude: 7.590789,     activity: Location.act3).save()
        Location l28 = new Location(title: "Muttenz Hinterer Wartenberg",   latitude: 47.523929, longitude: 7.658352,     activity: Location.act1).save()
        Location l29 = new Location(title: "Muttenz Hinterer Wartenberg",   latitude: 47.523929, longitude: 7.658352,     activity: Location.act2).save()
        Location l30 = new Location(title: "Muttenz Hinterer Wartenberg",   latitude: 47.523929, longitude: 7.658352,     activity: Location.act4).save()
        Location l31 = new Location(title: "Muttenz Hinterer Wartenberg",   latitude: 47.523929, longitude: 7.658352,     activity: Location.act5).save()
        Location l32 = new Location(title: "Bike Trail Arlesheim",          latitude: 47.503153, longitude: 7.623856,     activity: Location.act5).save()
        Location l33 = new Location(title: "Gempen Nord Trail",             latitude: 47.507360, longitude: 7.643177,     activity: Location.act5).save()
        Location l34 = new Location(title: "Gempen Kreuzung",               latitude: 47.472899, longitude: 7.658501,     activity: Location.act1).save()
        Location l35 = new Location(title: "Gempen Kreuzung",               latitude: 47.472899, longitude: 7.658501,     activity: Location.act2).save()
        Location l36 = new Location(title: "Gempen Kreuzung",               latitude: 47.472899, longitude: 7.658501,     activity: Location.act4).save()
        Location l37 = new Location(title: "Gempen Kreuzung",               latitude: 47.472899, longitude: 7.658501,     activity: Location.act5).save()

        //calculation for dates for one week in advance
        //the names of the variables do not match the actual weekday, but it's easier for working
        Date monday = new Date()
        Date tuesday = monday
        Date wednesday = monday
        Date thursday = monday
        Date friday = monday
        Date saturday = monday
        Date sunday = monday
        use(DateGroovyMethods) {
            monday.clearTime()
            tuesday = monday + 1
            wednesday = monday + 2
            thursday = monday + 3
            friday = monday + 4
            saturday = monday + 5
            sunday = monday + 6
        }

        Timeslot t1  = new Timeslot(date: monday,       timeslot: Timeslot.AM1).save()
        Timeslot t2  = new Timeslot(date: monday,       timeslot: Timeslot.AM2).save()
        Timeslot t3  = new Timeslot(date: monday,       timeslot: Timeslot.PM1).save()
        Timeslot t4  = new Timeslot(date: monday,       timeslot: Timeslot.PM2).save()
        Timeslot t5  = new Timeslot(date: monday,       timeslot: Timeslot.PM3).save()
        Timeslot t6  = new Timeslot(date: tuesday,      timeslot: Timeslot.AM1).save()
        Timeslot t7  = new Timeslot(date: tuesday,      timeslot: Timeslot.AM2).save()
        Timeslot t8  = new Timeslot(date: tuesday,      timeslot: Timeslot.PM1).save()
        Timeslot t9  = new Timeslot(date: tuesday,      timeslot: Timeslot.PM2).save()
        Timeslot t10 = new Timeslot(date: tuesday,      timeslot: Timeslot.PM3).save()

        Timeslot t11 = new Timeslot(date: wednesday,    timeslot: Timeslot.AM1).save()
        Timeslot t12 = new Timeslot(date: wednesday,    timeslot: Timeslot.AM2).save()
        Timeslot t13 = new Timeslot(date: wednesday,    timeslot: Timeslot.PM1).save()
        Timeslot t14 = new Timeslot(date: wednesday,    timeslot: Timeslot.PM2).save()
        Timeslot t15 = new Timeslot(date: wednesday,    timeslot: Timeslot.PM3).save()

        Timeslot t16 = new Timeslot(date: thursday,     timeslot: Timeslot.AM1).save()
        Timeslot t17 = new Timeslot(date: thursday,     timeslot: Timeslot.AM2).save()
        Timeslot t18 = new Timeslot(date: thursday,     timeslot: Timeslot.PM1).save()
        Timeslot t19 = new Timeslot(date: thursday,     timeslot: Timeslot.PM2).save()
        Timeslot t20 = new Timeslot(date: thursday,     timeslot: Timeslot.PM3).save()

        Timeslot t21 = new Timeslot(date: friday,       timeslot: Timeslot.AM1).save()
        Timeslot t22 = new Timeslot(date: friday,       timeslot: Timeslot.AM2).save()
        Timeslot t23 = new Timeslot(date: friday,       timeslot: Timeslot.PM1).save()
        Timeslot t24 = new Timeslot(date: friday,       timeslot: Timeslot.PM2).save()
        Timeslot t25 = new Timeslot(date: friday,       timeslot: Timeslot.PM3).save()

        Timeslot t26 = new Timeslot(date: saturday,     timeslot: Timeslot.AM1).save()
        Timeslot t27 = new Timeslot(date: saturday,     timeslot: Timeslot.AM2).save()
        Timeslot t28 = new Timeslot(date: saturday,     timeslot: Timeslot.PM1).save()
        Timeslot t29 = new Timeslot(date: saturday,     timeslot: Timeslot.PM2).save()
        Timeslot t30 = new Timeslot(date: saturday,     timeslot: Timeslot.PM3).save()

        Timeslot t31 = new Timeslot(date: sunday,       timeslot: Timeslot.AM1).save()
        Timeslot t32 = new Timeslot(date: sunday,       timeslot: Timeslot.AM2).save()
        Timeslot t33 = new Timeslot(date: sunday,       timeslot: Timeslot.PM1).save()
        Timeslot t34 = new Timeslot(date: sunday,       timeslot: Timeslot.PM2).save()
        Timeslot t35 = new Timeslot(date: sunday,       timeslot: Timeslot.PM3).save()

        Person p1 = new Person(firstName: "Thierry",    lastName: "Odermatt").save()
        Person p2 = new Person(firstName: "Alex",       lastName: "Odermatt").save()
        Person p3 = new Person(firstName: "Markus",     lastName: "Meier").save()

        Meetup m1 = new Meetup(location: l1, timeslot: t3, person: p1).save()
        Meetup m2 = new Meetup(location: l3, timeslot: t5, person: p1).save()
        Meetup m3 = new Meetup(location: l3, timeslot: t5, person: p2).save()
        Meetup m4 = new Meetup(location: l2, timeslot: t1, person: p2).save()
        Meetup m5 = new Meetup(location: l1, timeslot: t2, person: p1).save()

    }
    def destroy = {
    }

    static save(domainObject) {
        domainObject.withTransaction { tx ->
            domainObject.save(failOnError: true, flush: true)
        }
        return domainObject
    }
}
