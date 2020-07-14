package servlet.common;

import Beans.UserBean;
import services.ProfileMaintainceService;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayProfileServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try
        {
             int id=0;
           HttpSession session =req.getSession(false);
           if(session!=null)
           {
               id =(int)session.getAttribute("id");
              
           }
            String username=req.getParameter("username");
            String dob =req.getParameter("dob"); 
            String email=req.getParameter("email");
            String contact =req.getParameter("contact");
            
           List<UserBean> usb=ProfileMaintainceService.getEmployees(id);
           Iterator<UserBean> itr=usb.iterator();
        UserBean ub = null;
        if(itr.hasNext())
        {
            ub = itr.next();
            ub.setEmail(email);
            ub.setContact(contact);
            ub.setUsername(username);
            ub.setDob(dob);
        }
        if(ProfileMaintainceService.updateEmployee(ub))
        {
            resp.sendRedirect("/Jobipher/admindash.jsp");
        }
        }
        catch(Exception e)
        {
            System.out.println("Exception in DisplayprofileServlet"+e);
        }
    }
    
}
