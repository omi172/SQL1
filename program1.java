import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeData {

    static final String DB_URL = "jdbc:mysql://localhost:3306/empl";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            Object[][] empData = {
                {101, "Jenny", 25, 10000},
                {102, "Jacky", 30, 20000},
                {103, "Joe", 20, 40000},
                {104, "John", 40, 80000},
                {105, "Shameer", 25, 90000}
            };

            System.out.println("Inserting records into the table...");
            for (Object[] row : empData) {
                pstmt.setInt(1, (int) row[0]);
                pstmt.setString(2, (String) row[1]);
                pstmt.setInt(3, (int) row[2]);
                pstmt.setDouble(4, Double.valueOf(row[3].toString()));
                pstmt.addBatch();
            }

            pstmt.executeBatch();
            System.out.println("Successfully inserted " + empData.length + " records!");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
              if (pstmt != null)
                pstmt.close(); 
            } catch (SQLException e) {
              e.printStackTrace();
            }
            try { 
              if (conn != null) 
                conn.close(); 
            } catch (SQLException e) {
              e.printStackTrace();
            }
        }
    }
}
