package siva.bootjdbc.dao;

import java.util.List;

import siva.bootjdbc.model.Student;

public interface StudentDao {

	public int saveStudent(List<Student> student);

}
