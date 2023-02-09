import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;


public class SecondServletClass implements Servlet{
	static {
		System.out.println("SecondServletClass.class FileWriter is loading...");
	}
	public SecondServletClass() {}
	public void init(ServletConfig config)throws ServletException {
		System.out.println("servler initialization....");
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		res.setContentType("text/html");
		System.out.println("servlet request processing....");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>output</title> </head>");
		out.println("<body>");
		out.println("<marquee>Welcome to JAVA</marquee>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
	public String getServletInfo() {
		return null;
	}
	public void destroy() {
		System.out.println("servlet De-instanitiation....");
	}
	
}