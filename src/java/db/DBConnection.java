package db;

import java.sql.*;
public class DBConnection {
    public static Connection connect()
    {
        Connection con=null;
        
        try
	{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/jobipher","root","kanav");
	
        }
        catch(Exception e)
	{
	System.out.println("Exception in DBConnection"+e.getMessage());
	}
	return con;
    }
}