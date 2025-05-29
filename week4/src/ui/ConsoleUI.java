
package ui;

import db.DatabaseManager;
import models.*;
import scheduler.TimetableGenerator;

import java.util.*;

public class ConsoleUI {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager.initDatabase();

        System.out.println("Welcome to Timetable Generator!");

        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject(1, "Math", 1));
        subjects.add(new Subject(2, "Science", 2));
        subjects.add(new Subject(3, "English", 3));

        List<TimetableEntry> entries = TimetableGenerator.generate(subjects);
        for (TimetableEntry entry : entries) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
