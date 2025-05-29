
package models;

public class TimeSlot {
    private String day;
    private String period;

    public TimeSlot(String day, String period) {
        this.day = day;
        this.period = period;
    }

    public String getDay() { return day; }
    public String getPeriod() { return period; }

    @Override
    public String toString() {
        return day + " - " + period;
    }
}
