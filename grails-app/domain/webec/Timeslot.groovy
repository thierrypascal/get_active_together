package webec


class Timeslot {

    Date date
    String timeslot

    public static final String AM1  = "08:00"
    public static final String AM2  = "11:00"
    public static final String PM1  = "13:00"
    public static final String PM2  = "17:00"
    public static final String PM3  = "21:00"

    public static final List<String> TIME_SLOTS = [AM1, AM2, PM1, PM2, PM3]

    String toString() {
        if (this.date != null){
            "$timeslot, ${date.year + 1900}-${date.month + 1}-${date.date}"     //to not show the nulled time
        }else{
            "$timeslot, $date"
        }
    }

    static constraints = {
        date nullable: false
        timeslot nullable: false, inList: TIME_SLOTS
    }
}
