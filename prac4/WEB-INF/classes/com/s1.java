import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class s1 extends HttpServlet
{

	public void init() throws ServletException
	{
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		Cookie[] cookies=req.getCookies();
		int count=0;
		for(Cookie cookie:cookies)
		{
			if(cookie!=null)
			{
			  // count = Integer.parseInt(cookie.getValue());
			   count++;
        	   cookie.setValue(count+"");
		  	 }
		  	 else
			 {
			 	res.addCookie(cookie);
			 }
		}

		out.print("<html><body>");
		out.print("<h3>"+count+"</h3>");
		out.print("</body></html>");
	}
}





