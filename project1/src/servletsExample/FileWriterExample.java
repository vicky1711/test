package servletsExample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileWriterExample
 */
@WebServlet("/FileWriterExample")
public class FileWriterExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileWriterExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
        String Dob = request.getParameter("Dob");
        String NRIC = request.getParameter("NRIC");
        String PhoneNumber = request.getParameter("PhoneNumber");
       
        File file = new File("D:\\newfile.txt");
        
        try{
    	PrintWriter output = new PrintWriter(file);
        output.println("The Name is:" + name);
        output.println("The Dob is:" + Dob);
        output.println("The NRIC is:" + NRIC);
        output.println("The PhoneNumber is:" + PhoneNumber);
        output.close();
        }catch(IOException ex) {
        	System.out.println("Error: %s\n, ex");
        }
		
	}

}
