package mysql.examples;

import java.sql.*;

public class JDBC_Example_2 {

    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/employees?"
                            + "user=root&password=&useSSL=false");

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from employees.employees");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                int emp_no = resultSet.getInt("emp_no");
                String fName = resultSet.getString("first_name");
                String lName = resultSet.getString("last_name");
                //int units = resultSet.getInt("credits");

                // print out the result
                System.out.println("Employee No: " + emp_no + " is " + fName + " " + lName);
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
