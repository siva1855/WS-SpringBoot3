package siva.bootjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.bootjdbc.dao.StudentDao;
import siva.bootjdbc.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int saveStudent(List<Student> student) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
		int count = jdbcTemplate.update(sql, (((Student) student).getStudentId()),
				                              ((Student) student).getStudentName(),
				                             ((Student) student).getStudentFee(),
				                             ((Student) student).getStudentCourse(), 
				                             ((Student) student).getStudentFeeDiscount());
		return count;
	}

	
}
