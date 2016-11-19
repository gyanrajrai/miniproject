package kist.com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kist.com.service.StudentService;
import kist.com.service.StudentServiceImplement;

/**
 * Servlet implementation class DeleteStudent
 */
@WebServlet("/deleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		StudentService studentservice=new StudentServiceImplement ();
		
		
		try{
			int id = Integer.parseInt(request.getParameter("id"));
		
			studentservice.deleteStudent(id);
			
			
			
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("deleted ur data");
		}
		
		
		getServletContext().getRequestDispatcher("/display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
