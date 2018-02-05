package mypack;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class SimpleServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String format=request.getParameter("format");
		PrintWriter out=response.getWriter();
		if(format.equals("plain"))
			response.setContentType("text/plain");
		else if(format.equals("html"))
		    response.setContentType("text/html");
		else
			response.setContentType("application/msword");
			out.println("<h1>It is H1 heading</h1>");
			out.println("<h2>It is H2 heading</h2>");
			out.println("<h3>It is H3 heading</h3>");
			out.println("<h4>It is H4 heading</h4>");
			out.println("<h5>It is H5 heading</h5>");
			out.println("<h6>It is H6 heading</h6>");
			out.close();
	}
}
