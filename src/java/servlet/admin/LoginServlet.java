
package servlet.admin;

import Beans.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.LoginServices;

public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        try(PrintWriter out=res.getWriter())
        {
            String name = req.getParameter("nm");
            String pass = req.getParameter("p");
            UserBean user= LoginServices.authenticateUser(name,pass);
            int id=user.getId();
            HttpSession session= req.getSession();
             session.setAttribute("id",id);
            if(user!=null)
            {
                   res.sendRedirect("admindash.jsp");
               
            }
             else
                {
                    RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
                    rd.include(req,res);
                }
        }
        catch(Exception e)
        {
            System.out.println("Exception in login servlet"+e);
        }
    }   
}