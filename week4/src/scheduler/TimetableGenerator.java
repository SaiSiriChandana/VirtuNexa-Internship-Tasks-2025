
package scheduler;

import models.*;

import java.util.*;

public class TimetableGenerator {
    public static List<TimetableEntry> generate(List<Subject> subjects) {
        List<TimetableEntry> timetable = new ArrayList<>();
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        String[] periods = {"9AM", "10AM", "11AM", "12PM", "1PM"};

        int index = 0;
        for (String day : days) {
            for (String period : periods) {
                if (index >= subjects.size()) break;
                timetable.add(new TimetableEntry(new TimeSlot(day, period), subjects.get(index)));
                index++;
            }
        }

        return timetable;
    }
}
