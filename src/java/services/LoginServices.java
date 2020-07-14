
package services;

import Beans.UserBean;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginServices {
    public static UserBean authenticateUser(String username,String Password)
    {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
          
        try
        {
        con=DBConnection.connect();
        stmt=con.prepareStatement("select common_cred.id,common_cred.password from common_cred "
                + " INNER JOIN user_main ON common_cred.id=user_main.userid where common_cred.username=?");
        stmt.setString(1,username);
        rs=stmt.executeQuery();
        if(rs.next())
        {
            if(Password.equals(rs.getString("password")))
            {
              
                UserBean usb=new UserBean();
                usb.setId(rs.getInt("id"));
                return usb;
            }
        }
        }
        catch(Exception e)
	{
	System.out.println("Exception in LoginServices  "+e.getMessage());
	}
        finally
	{
	try
	{
	    stmt.close();
            con.close();
            rs.close();
        }
	catch(Exception e)
	{
	System.out.println("Exception in LoginServices finally"+e.getMessage());
	}
	}
	
        return null;
    }
}
