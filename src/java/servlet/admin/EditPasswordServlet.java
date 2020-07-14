package servlet.admin;

import Beans.UserBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.UserMaintainceServices;


public class EditPasswordServlet extends HttpServlet 
{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try(PrintWriter out=resp.getWriter())
        {  
            HttpSession session =req.getSession(false);
            int id = Integer.parseInt(session.getAttribute("id").toString());
            System.out.println(id);
            String oldpass=req.getParameter("od");
            String newpass=req.getParameter("p");
           
        
        if(UserMaintainceServices.updatePassword(oldpass,newpass,id))
        {   
            resp.sendRedirect("/Jobipher/admindash.jsp?userid="+id);
        }
        }
        catch(Exception e)
        {
            System.out.println("Exception in DisplayEditServlet"+e);
        }
    }
    
}
