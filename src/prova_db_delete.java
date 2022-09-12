// Java program to insert records to a table using JDBC

import java.sql.*;

public class prova_db_delete {

    // url che punta al database mysql
    static final String url
            = "jdbc:mysql://localhost:3306/rubrica";

    public static void main(String[] args)
            throws ClassNotFoundException
    {
        try {
            // this Class.forName() method is user for
            // driver registration with name of the driver
            // as argument

            // we have used MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // getConnection() establishes a connection. It
            // takes url that points to your database,
            // username and password of MySQL connections as
            // arguments
            Connection conn = DriverManager.getConnection(
                    url, "root", "");

            // create.Statement() creates statement object
            // which is responsible for executing queries on
            // table
            Statement stmt = conn.createStatement();

            // executeUpdate() is used for INSERT, UPDATE,
            // DELETE statements.It returns number of rows
            // affected by the execution of the statement
            int result = stmt.executeUpdate("DELETE FROM anagrafica_clienti WHERE id_anagrafica=2");

            // if result is greater than 0, it means values
            // has been added
            if (result > 0)
                System.out.println("Record eliminato correttamente");

            else
                System.out.println(
                        "Record non eliminato. Verificare funzione");

            // closing connection
            conn.close();
        }

        catch (SQLException e) {
            System.out.println(e);
        }
    }
}



