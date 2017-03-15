package studentcourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author Ioana
 */
public class Connectionx {
    private Connection con = null;  
    public Connectionx()
    {
        Conexiune();
    }
    public Connection getConnection()
    {
        return con;
    }
    private void Conexiune() 
{
     // Create a variable for the connection string.  
      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
              "databaseName=CoursesManagement;integratedSecurity=true;"; 
      // Declare the JDBC objects.   
      try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
      con = DriverManager.getConnection(connectionUrl);   
      }  
  
      // Handle any errors that may have occurred.  
      catch (Exception e) {  
         e.printStackTrace();  
      }  
}
}
