package siva.bootjdbc.daoimpl;

import java.util.List;
import java.util.stream.Collectors;

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
	public int[] saveStudent(List<Student> studentList) {
		String sql="INSERT INTO STUDENT VALUES(?,?,?,?,?)";
		List<Object[]> listObjects=studentList.stream()
				.map(s->new Object[] {
				                     s.getStudentId(),
				                     s.getStudentName(),
				                     s.getStudentFee(),
				                     s.getStudentCourse(),
				                     s.getStudentFeeDiscount()})
				.collect(Collectors.toList());
		int[] count=jdbcTemplate.batchUpdate(sql,listObjects);
		
		return count;
}

}
