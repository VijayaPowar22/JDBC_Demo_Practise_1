package jdbc_demo_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "root";

        try {

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            // 2. Create Statement
            Statement stmt = con.createStatement();

            // 3. SQL query
            String query = "INSERT INTO student VALUES (1, 'Vijaya', 22, 'Ichalkaranji')";

            // 4. Execute query
            int rows = stmt.executeUpdate(query);

            // 5. Check result
            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}