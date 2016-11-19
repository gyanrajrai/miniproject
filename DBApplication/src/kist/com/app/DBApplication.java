package kist.com.app;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import kist.com.domain.Student;
import kist.com.service.StudentService;
import kist.com.service.StudentServiceImplement;

public class DBApplication {

	public static void main(String[] args) {

		StudentService studentservice = new StudentServiceImplement();

		try {//
				// insert into student (firstname, lastname, email, ph_no,
				// faculty, updated_ts, created_ts)
				// create Student

			Student student = new Student();
			student.setFirstName("Gopal");
			student.setLastName("Hanks");
			student.setEmail("Gopala@gmail.com");
			student.setPhone("097409709247");
			student.setFaculty("BIT");
			student.setUpdatedTs(new Date());

			student.setCreatedTs(new Date());
			studentservice.creatStudent(student);

			// select student Student student2 =
			studentservice.getStudent(100);
			System.out.println("Record info is :" + student);

			// delete // studentservice.deleteStudent("mamata"); // get
			List<Student> studentLis = studentservice.getStudentList();
			for (Student student1 : studentLis) {
				System.out.println("firstname is  " + student1.getFirstName());
				System.out.println("lastname is  " + student1.getLastName());
				System.out.println("emaail is   " + student.getEmail());
				System.out.println("Phone nu is  " + student1.getPhone());
				System.out.println("faculty is " + student1.getFaculty());
				System.out.println("updated time is " + student1.getUpdatedTs());
				System.out.println("created time is  " + student1.getCreatedTs());

			}

			// update student
			Student updatedStudent = studentservice.getStudent(100);
			/*
			 * taking from database
			 */
			// updatedStudent.setFirstName("Hilary");
			// updatedStudent.setLastName("trunk");
			// updatedStudent.setEmail("bsabkj@gmail.com");
			// updatedStudent.setFaculty("BBA");
			updatedStudent.setPhone("9843757898");

			studentservice.updateStudent(updatedStudent);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

	}

}
