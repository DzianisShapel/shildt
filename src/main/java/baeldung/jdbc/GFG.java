package baeldung.jdbc;

import java.sql.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        String url
                = "jdbc:postgresql://localhost:5432/demo"; // table details
        String username = "postgres"; // MySQL credentials
        String password = "postgres";
        String query
                = "select distinct fare_conditions from seats"; // query to be run
        String insertQuery
                = "INSERT INTO seats (aircraft_code, seat_no, fare_conditions) VALUES ('320', '62A', 'Comfort')";

        Class.forName(
                "org.postgresql.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery(query); // Execute query
        while (rs.next()) {
            String name
                    = rs.getString("fare_conditions");
            System.out.println(name);
        } // Retrieve name from db

        int count = st.executeUpdate(insertQuery);
        System.out.println(
                "number of rows inserted= "
                        + count);

        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}
