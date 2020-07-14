/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Beans.UserBean;
import db.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProfileMaintainceService 
{
 public static List<UserBean> getEmployees(int currentaccount)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<UserBean> empSet=null;
		try
		{
				con=DBConnection.connect();
				pstmt=con.prepareStatement("select common_cred.id,common_cred.username,user_main.dob,common_cred.email"
                                        + ",common_cred.contact from common_cred INNER JOIN user_main "
                                        + "ON common_cred.id=user_main.userid where common_cred.id=?");
				pstmt.setInt(1,currentaccount);
                                rs=pstmt.executeQuery();
				empSet=new ArrayList<UserBean>();
				if(rs.next())
				{
					UserBean emp=new UserBean();
					emp.setId(rs.getInt("id"));
					emp.setUsername(rs.getString("username"));
					emp.setDob(rs.getString("dob"));
                                        emp.setEmail(rs.getString("email"));
                                        emp.setContact(rs.getString("contact"));
					empSet.add(emp);
				}
		}
		catch(Exception e)
		{
			System.out.println("Exception in  getEmployees()"+e);
		}
		finally		
		{
			try
			{
				pstmt.close();
				con.close();
				rs.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception in finally getEmployees()"+e);
			}

		}
		
		return empSet; 
	}
   public static boolean updateEmployee(UserBean emp)
	{
		Connection con=null;
	PreparedStatement pstmt=null;
	try
	{
	con=DBConnection.connect();
	pstmt=con.prepareStatement("update common_cred INNER JOIN user_main ON common_cred.id=user_main.userid"
                             + " set common_cred.username=?,user_main.dob=?,common_cred.email=?,common_cred.contact=? "
                             + " where common_cred.id=?");
	pstmt.setInt(5,emp.getId());
	pstmt.setString(1,emp.getUsername());
        pstmt.setString(2, emp.getDob());
	pstmt.setString(3,emp.getEmail());
        pstmt.setString(4,emp.getContact());
	int result=pstmt.executeUpdate();
            System.out.println(result);
	return (result!=0);
	}
	catch(Exception e)
		{
		System.out.println("Exception in updateEmployee"+e);
		}
		finally
		{
			try
			{
				pstmt.close();
				con.close();
			}
				catch(Exception e)
			{
		System.out.println("Exception in finally updateEmployee"+e);
				}

		}
		return false;

	}
}
