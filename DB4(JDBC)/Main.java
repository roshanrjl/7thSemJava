import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // MySQL database URL
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";  // change if your MySQL username is different
        String password = "";      // change if your MySQL password is set

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                // Uncomment below lines if you want to fetch more fields
                // String name = resultSet.getString("name");
                // float value = resultSet.getFloat("value");
                System.out.println("ID: " + id);
            }

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred");
            e.printStackTrace();
        }
    }
}
