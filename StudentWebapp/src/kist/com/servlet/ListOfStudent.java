package kist.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kist.com.service.StudentService;
import kist.com.service.StudentServiceImplement;
import kist.com.util.DBUtil;

/**
 * Servlet implementation class ListOfStudent
 */
@WebServlet("/listStudent")
public class ListOfStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListOfStudent() {
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
		PrintWriter p = response.getWriter();
		p.println("<h1> this is a stuentList  come form database</h1>");
		StudentService studentservice = new StudentServiceImplement();

		try {

			int ID = Integer.parseInt(request.getParameter("id"));
			Statement st = DBUtil.getConnection().createStatement();
			ResultSet rst = st.executeQuery("select * from student where id=" + ID);
		     
			studentservice.getStudent(ID);
			System.out.println(rst.getRow());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// getServletContext().getRequestDispatcher("/listdisplay.jsp").forward(request,
		// response);

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
