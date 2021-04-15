package siva.bootjdbc.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootjdbc.dao.StudentDao;
import siva.bootjdbc.model.Student;
import siva.bootjdbc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public int saveStudent(Student student) {
		double sfee = student.getStudentFee();
		student.setStudentFeeDiscount(sfee * 5 / 100.0);
		return studentDao.saveStudent(student);
	}

	@Override
	public int updateStudent(Student student) {
		double sfee = student.getStudentFee();
		student.setStudentFeeDiscount(sfee * 5 / 100.0);
		return studentDao.updateStudent(student);
	}

	@Override
	public int delectStudent(Integer id) {
		return studentDao.delectStudent(id);
	}

	@Override
	public Student getOneStudent(Integer id) {
		return studentDao.getOneStudent(id);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = studentDao.getAllStudents();
		list = list.stream().sorted((o1, o2) -> o2.getStudentId() - o1.getStudentId()).collect(Collectors.toList());
		return list;
	}

}
