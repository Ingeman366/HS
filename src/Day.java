public class Day {
    private boolean holiday;
    private Booking book1;
    private Booking book2;
    private Booking book3;
    private Booking book4;
    private Booking book5;
    private Booking book6;
    private Booking book7;
    private DaysOfTheWeek daysOfTheWeek;
    private int date;
    private static int superDate = 1;


    public Day(DaysOfTheWeek daysOfTheWeek,int date){
        this.daysOfTheWeek = daysOfTheWeek;
        this.date = superDate++;
    }


}
