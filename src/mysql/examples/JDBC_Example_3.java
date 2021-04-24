package mysql.examples;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Example_3 {

    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/FoodOrderingSystem?"
                            + "user=root&password=&useSSL=false");

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            System.out.println("Select a Restaurant");
            Scanner scan = new Scanner(System.in);
            int selection = scan.nextInt();
            String query = "SELECT r.name, f.item, f.price, f.calories " +
                    "FROM restaurants r " +
                    "LEFT JOIN food f " +
                    "on r.id = f.id_restaurant " +
                    "Where r.id = " + selection + ";";

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery(query);

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                String restaurant = resultSet.getString("name");
                String item = resultSet.getString("item");
                double price = resultSet.getDouble("price");
                //int units = resultSet.getInt("credits");

                // print out the result
                System.out.println(restaurant + " - Item: " + item + " $" + price);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
