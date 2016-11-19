package kist.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kist.com.domain.Student;
import kist.com.service.StudentService;
import kist.com.service.StudentServiceImplement;

/**
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		StudentService studentservice = new StudentServiceImplement();

		try {
			int id = Integer.parseInt(request.getParameter("id"));
			Student td = studentservice.getStudent(id);
			String fname=td.getFirstName();
		String lanem=td.getLastName();
		String email=td.getEmail();
			int phone=Integer.parseInt(td.getPhone());
			String faculty=td.getFaculty();

		} catch (Exception e) {
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/displayform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
