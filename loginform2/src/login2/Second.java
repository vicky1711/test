package login2;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
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
		// TODO Auto-generated method stub
		HashMap<String,String> uc = new HashMap <String,String>(); {
            uc.put("vicky@gmail.com", "pass1");
            uc.put("ganesh@gmail.com", "pass2");
            uc.put("parivalen@gmail.com", "pass3");
            uc.put("vigneshsb@gmail.com", "pass4");
            
                
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        String passOnMap = uc.get(email);
        
        if (passOnMap  != null
                && passOnMap .equals(password)){  
	        response.sendRedirect("third.jsp");
			  
      
        }else{
			request.setAttribute("email", email);
		    request.getRequestDispatcher("Four.jsp").forward(request, response);
			
        }
		
		
	}
	}
}
