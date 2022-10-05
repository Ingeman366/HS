import java.util.ArrayList;

public class Calender {

    private ArrayList<Day> daysOfSeptember = new ArrayList();

    public Calender() {
        for (int i = 1; i <= 30; i++) {
            daysOfSeptember.add(new Day(i));
        }
    }

    public Day getDate(int date){
        return daysOfSeptember.get(date-1);
    }
}
