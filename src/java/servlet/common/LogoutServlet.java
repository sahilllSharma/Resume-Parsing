package servlet.common;
import services.ProfileMaintainceService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LogoutServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    try
    {
      HttpSession session =req.getSession(true);
      if(session!=null)
      {
          session.invalidate();
          resp.sendRedirect("home.jsp");
      }
      resp.setHeader("Cache-Control","no-cache");
      resp.setHeader("Cache-Control","no-store");
      resp.setDateHeader("Expires",0);
      resp.setHeader("Pragma","no-cache");
    }
    catch(Exception e)
    {
	System.out.println("Exception in logoutServlet"+e);
    }
    }
    
}
