import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // 1 . Setup the database connection
        String url = "jdbc:postgresql://ep-raspy-frog-a5vzaqws-pooler.us-east-2.aws.neon.tech/neondb?user=neondb_owner&password=npg_9QvSjpMCE6kz&sslmode=require";

        try {
            // 2. Load the MySQL JDBC driver
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // load the PostgreSQL JDBC driver
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("PostgreSQL JDBC Driver not found");
                e.printStackTrace();
                return;
            }
            // 3. Establish the connection
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to the database!");

            // 4 Create a statement
            Statement statement = connection.createStatement();

            // 5 Execute a query
            ResultSet resultSet = statement.executeQuery("select * from playing_with_neon");

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Float value = resultSet.getFloat("value");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
