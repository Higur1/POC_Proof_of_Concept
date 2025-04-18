public class Birthday {

    //private attributes not serializable
    private int day;
    private int month;

    //available to serialized
    public int year;

    //is necessary to deserialized - first create a empty constructor and after set values
    public Birthday(){}

    public Birthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //available to serialized
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /*//if use setter - is possible deserializer but not serializer
    public void setYear(int year) {
        this.year = year;
    }*/



    @Override
    public String toString() {
        return "Birthday{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
