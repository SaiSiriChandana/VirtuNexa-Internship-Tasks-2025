import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {
    public static void initializeDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:game.db")) {
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS scores (id INTEGER PRIMARY KEY, outcome TEXT)";
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
