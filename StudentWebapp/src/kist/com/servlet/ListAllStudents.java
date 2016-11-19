package kist.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kist.com.domain.Student;
import kist.com.service.StudentService;
import kist.com.service.StudentServiceImplement;

/**
 * Servlet implementation class ListAllStudents
 */
@WebServlet("/listAllStudents")
public class ListAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListAllStudents() {
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
		response.setContentType("text/html");
		PrintWriter pst = response.getWriter();
		pst.println("<h1> this is ALl  stuentList  come form database</h1>");
		StudentService studentservice = new StudentServiceImplement();
		List<Student> studentlistt = new ArrayList<Student>();
		try {
			studentlistt = studentservice.getStudentList();
			for (Student std : studentlistt) {
				System.out.println(std.getId());
				System.out.println(std.getFirstName());
				System.out.println(std.getLastName());
				System.out.println(std.getEmail());
				System.out.println(std.getPhone());
				System.out.println(std.getFaculty());
				System.out.println(std.getId());
				System.out.println(std.getCreatedTs());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("studentList", studentlistt);
		getServletContext().getRequestDispatcher("/display.jsp").forward(request, response);
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
