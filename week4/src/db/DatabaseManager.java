
package db;

import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:resources/timetable.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public static void initDatabase() {
        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            String teacherTable = "CREATE TABLE IF NOT EXISTS teachers (id INTEGER PRIMARY KEY, name TEXT);";
            String subjectTable = "CREATE TABLE IF NOT EXISTS subjects (id INTEGER PRIMARY KEY, name TEXT, teacherId INTEGER);";
            stmt.execute(teacherTable);
            stmt.execute(subjectTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
