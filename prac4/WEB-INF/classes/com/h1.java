import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletConfig;
public class h1 extends HttpServlet
{
	public void init()throws ServletException
	{
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		out.print("<html><body>");
		out.print("<h1>hello</h1>");
		out.print("</body></html>");

	}

	   public void destroy()
	   {
   		}
}

