package webec


class Location {
    String title
    String description
    String coordinates
    String activity

    public static final String act1  = "Jogging"
    public static final String act2  = "Walking"
    public static final String act3  = "Power Walking"
    public static final String act4  = "Cycling"
    public static final String act5  = "Mountain Biking"

    public static final List<String> ACTIVITY = [act1, act2, act3, act4, act5]

    String toString() {"$title, Aktivität: $activity, Standort: $coordinates"}

    static constraints = {
        title nullable: false
        description nullable: true
        coordinates nullable: false
        activity nullable: false, inList: ACTIVITY
    }
}
