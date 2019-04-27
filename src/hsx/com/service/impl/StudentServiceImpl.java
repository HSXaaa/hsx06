package hsx.com.service.impl;

import java.util.List;

import hsx.com.dao.StudentDao;
import hsx.com.model.Student;
import hsx.com.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public int deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	@Override
	public List<Student> findStudents() {
		return studentDao.findStudents();
	}

	

}
