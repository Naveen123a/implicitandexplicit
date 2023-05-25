

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Url
 */
public class Url extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Url() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("userid");
//Url method		response.sendRedirect("Url1?user="+user);

		//		hidden method
		PrintWriter pw=response.getWriter();

		response.setContentType("text/html");
		//pw is not only taken for a output based object but also we can write a HTML as an output over here 
		pw.print("<HTML><body><form action='Url1'>"
				+ "<input type='hidden' name='user' value='"+user+"'>"
						+ "<input type='submit'>"
				+ "</form></body></HTML>");

	}

}
