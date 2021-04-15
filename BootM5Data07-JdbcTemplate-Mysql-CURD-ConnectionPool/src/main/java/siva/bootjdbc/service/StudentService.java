package siva.bootjdbc.service;

import java.util.List;

import siva.bootjdbc.model.Student;

public interface StudentService {

	public int saveStudent(Student student);

	public int updateStudent(Student student);

	public int delectStudent(Integer id);

	public Student getOneStudent(Integer id);

	public List<Student> getAllStudents();

}
