package customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String email = request.getParameter("mail");
		String phone = request.getParameter("pNumber");
		String userName = request.getParameter("uName");
		String password = request.getParameter("pwd");
		
		//Called to customerDbUtil - insertCustomer 
		boolean isSuccessFull = customerDbUtil.insertCustomer(name, email, phone, userName, password);
		
		if(isSuccessFull == true) {
			
			//Pass Details Success.jsp
			RequestDispatcher dis = request.getRequestDispatcher("Success.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("unSucces.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
