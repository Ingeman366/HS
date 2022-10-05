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


    public Day(int date){
        this.date = superDate++;
    }

    @Override
    public String toString() {
        return "Dato: " + date +
                "\n10-11: " + (book1==null? "FRI" : book1) +
                "\n11-12: " + (book2==null? "FRI" : book2) +
                "\n13-14: " + (book3==null? "FRI" : book3) +
                "\n14-15: " + (book4==null? "FRI" : book4) +
                "\n15-16: " + (book5==null? "FRI" : book5) +
                "\n16-17: " + (book6==null? "FRI" : book6) +
                "\n17-18: " + (book7==null? "FRI" : book7);
    }
}
