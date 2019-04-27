package hsx.com.dao;

import java.util.List;

import hsx.com.model.Student;

public interface StudentDao {

	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int id);
	
	public List<Student> findStudents();
}
