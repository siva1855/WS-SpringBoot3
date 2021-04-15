package siva.bootjdbc.service;

import java.util.List;

import siva.bootjdbc.model.Student;

public interface StudentService {

	public int[] insertStudents(List<Student> listStudent);
}
