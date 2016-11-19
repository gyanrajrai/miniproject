package kist.com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import kist.com.domain.Student;
import kist.com.util.DBUtil;
import com.mysql.jdbc.StringUtils;



public class StudentServiceImplement implements StudentService {

	@Override
	public void creatStudent(Student student) throws ClassNotFoundException, SQLException {

		// insert statement
		String insertQuery = "insert into student(firstname,lastname,email,ph_no,faculty,updated_ts,created_ts)"
				+ "values(?,?,?,?,?,?,?);";
		PreparedStatement pst = DBUtil.getConnection().prepareStatement(insertQuery);

		pst.setString(1, student.getFirstName());

		pst.setString(2, student.getLastName());
		pst.setString(3, student.getEmail());
		pst.setString(4, student.getPhone());
		pst.setString(5, student.getFaculty());
		pst.setTimestamp(6, new Timestamp(new Date().getTime()));
		pst.setTimestamp(7, new Timestamp(new Date().getTime()));
		// execute the prepared Statement
		pst.execute();



	}

	@Override
	public void updateStudent(Student student) throws ClassNotFoundException, SQLException {

		// update and delete
		StringBuilder update = new StringBuilder("update student set");
		/*
		 * * StringBuilder()This constructs a string builder with no characters
		 * in it and an initial capacity of 16 characters
		 */
		//if (!StringUtils.isEmptyOrWhitespaceOnly(student.getFirstName())) {
			/*
			 * * StringUtils handles null input Strings quietly. That is to say
			 * that a null input will return null. Where a boolean or int is
			 * being returned details vary by method.
			 */

			//update.append(" firstname=" + "'" + student.getFirstName() + "'");
			//update.append(" ,");

	//	}
		
		//if (!StringUtils.isEmptyOrWhitespaceOnly(student.getLastName())) {
			//update.append(" lastname=" + "'" + student.getLastName() + "'");
			//update.append((","));

		//}
		//if (!StringUtils.isEmptyOrWhitespaceOnly(student.getEmail())) {
			//update.append("email =" + "'" + student.getEmail() + "'");
			//update.append(",");
	//	}
		if (!StringUtils.isEmptyOrWhitespaceOnly(student.getFirstName())){
 
			update.append("Phone number =" + "'" + student.getPhone() + "'");
			update.append(",");

		}
		if (!StringUtils.isEmptyOrWhitespaceOnly(student.getFaculty())) {
			update.append(" faculty =" + "'" + student.getFaculty() + "'");

		}
		update.append("where id=" + student.getId());
		System.out.println(update.toString());

		PreparedStatement psmt = DBUtil.getConnection().prepareStatement(update.toString());

		psmt.execute();


	}
	

	@Override

	public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String delete = "delete from student where id=?";
		PreparedStatement psmt = DBUtil.getConnection().prepareStatement(delete);
		psmt.setInt(1, id);
		psmt.execute();


	}

	@Override
	public Student getStudent(int id) throws ClassNotFoundException, SQLException {
		

		Statement st = DBUtil.getConnection().createStatement();

		ResultSet rst = st.executeQuery("select * from student where id=" + id);
		Student student = null;

		while (rst.next()) {

			student = new Student();
			student.setId(rst.getInt("id"));
			student.setFirstName(rst.getString("firstname"));
			student.setLastName(rst.getString("lastname"));
			student.setEmail(rst.getString("email"));
			student.setPhone(rst.getString("ph_no"));
			student.setFaculty(rst.getString("faculty"));
		//	student.setUpdatedTs(new Date(rst.getString("updated_ts")));
	//	 student.setCreatedTs(new Date(rst.getString("created-ts")));
		}
		return student;

	}

	@Override
	public List<Student> getStudentList() throws ClassNotFoundException, SQLException {
		List<Student> studentList = new ArrayList();
		// create statemnet
		Statement st = DBUtil.getConnection().createStatement();

		ResultSet rst = st.executeQuery("select * from Student");
		Student student = null;
		while (rst.next()) {
			/*
			 * System.out.println(rst.getString("firstname"));
			 * System.out.println(rst.getString("lastname"));
			 * System.out.println(rst.getString("email"));
			 * System.out.println(rst.getString("ph_no"));
			 * System.out.println(rst.getString("faculty"));
			 * System.out.println(rst.getString("updated_ts"));
			 * System.out.println(rst.getString("created_ts"));
			 */
			student = new Student();
			student.setId(rst.getInt("id"));
			student.setFirstName(rst.getString("firstname"));
			student.setLastName(rst.getString("lastname"));
			student.setEmail(rst.getString("email"));
			student.setPhone(rst.getString("ph_no"));
			student.setFaculty(rst.getString("faculty"));
			student.setUpdatedTs(rst.getDate("updated_ts"));
			student.setCreatedTs(rst.getDate("created_ts"));
			studentList.add(student);

		}
		return studentList;


	}

}
