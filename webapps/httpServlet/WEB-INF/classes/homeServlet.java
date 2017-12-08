import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class homeServlet extends HttpServlet
{
	static{
		System.out.println("\n\t**********************************************************");
		System.out.println("\n\t\t***Home Servlet Loading***");
	}
	
		public homeServlet(){
			System.out.println("\t\t***Home Servlet Instantiation***");
		}
		public void init(ServletConfig config){
			System.out.println("\t\t***Home Servlet Initialization***");
			destroy();
		}
			public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
				{
				System.out.println("\t\t***Home Request Processing***");
			}
			public void destroy(){
				System.out.println("\t\t***Home Servlet Deinstantiation***");
				System.out.println("\n\t**********************************************************\n\n");
			}
}
