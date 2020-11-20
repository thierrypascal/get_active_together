package webec


class Loc {
    String title
    String description
    String coordinates
    String activity
    String time
    String teilnehmer

    public static final String act1  = "Jogging"
    public static final String act2  = "Walking"
    public static final String act3  = "Power Walking"
    public static final String act4  = "Cycling"
    public static final String act5  = "Mountain Biking"

    public static final List<String> ACTIVITY = [act1, act2, act3, act4, act5]

    public static final String AM1  = "08:00"
    public static final String AM2  = "11:00"
    public static final String PM1  = "13:00"
    public static final String PM2  = "17:00"
    public static final String PM3  = "21:00"

    public static final List<String> TIME = [AM1, AM2, PM1, PM2, PM3]


    String toString() {"Ort: $title, Aktivität: $activity"}

    static constraints = {
        title nullable: false
        description nullable: true
        coordinates nullable: false
        activity nullable: false, inList: ACTIVITY
        time nullable: false, inList: TIME
        teilnehmer nullable: true
    }
}
