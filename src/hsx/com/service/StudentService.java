package hsx.com.service;

import java.util.List;

import hsx.com.model.Student;

public interface StudentService {

	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int id);
	
	public List<Student> findStudents();
}
