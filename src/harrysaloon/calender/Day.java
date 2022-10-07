package harrysaloon.calender;

import harrysaloon.Booking;
import harrysaloon.DaysOfTheWeek;
import harrysaloon.TextColor;

public class Day {
    private boolean holiday;
    private Booking booking;
    private DaysOfTheWeek daysOfTheWeek;
    private int date;
    private Booking[] bookingsArr = new Booking[7];

    public Day(int date) {
        this.date = date;
        for (int i = 0; i < bookingsArr.length; i++) {
            this.bookingsArr[i] = booking;
        }

    }

    @Override
    public String toString() {
        return "Date: " + date +
                "\nSlot [1] 10-11: " + (bookingsArr[0] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[0]) +
                "\nSlot [2] 11-12: " + (bookingsArr[1] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[1]) +
                "\nSlot [3] 13-14: " + (bookingsArr[2] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[2]) +
                "\nSlot [4] 14-15: " + (bookingsArr[3] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[3]) +
                "\nSlot [5] 15-16: " + (bookingsArr[4] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[4]) +
                "\nSlot [6] 16-17: " + (bookingsArr[5] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[5]) +
                "\nSlot [7] 17-18: " + (bookingsArr[6] == null ? TextColor.GREEN_BACKGROUND +
                "  " + TextColor.RESET : bookingsArr[6]);
    }

    public void setBooking(int i, String name) {
        bookingsArr[i] = new Booking(name);
    }

    public void removeBooking(int i) {
        bookingsArr[i] = null;
    }

    public void getDailyEarning(int date) {
    }
}