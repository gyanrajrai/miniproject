package kist.com.service;
import java.sql.SQLException;
import java.util.List;

import kist.com.domain.Student;


public interface StudentService {
	
//this service will interact with student table in the database
//so we will include all the methods that we need to interact with the student table

public void creatStudent(Student student)throws ClassNotFoundException,SQLException;

public void updateStudent(Student student)throws ClassNotFoundException,SQLException;

public void deleteStudent(int id)throws ClassNotFoundException,SQLException;

public Student getStudent(int id)throws ClassNotFoundException,SQLException;

public List<Student> getStudentList()throws ClassNotFoundException,SQLException;


}