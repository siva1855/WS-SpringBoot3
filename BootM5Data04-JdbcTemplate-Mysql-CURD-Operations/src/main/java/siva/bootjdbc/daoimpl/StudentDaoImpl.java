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
	public int saveStudent(Student student) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
		int count = jdbcTemplate.update(sql, student.getStudentId(),
				                             student.getStudentName(),
				                             student.getStudentFee(),
				                             student.getStudentCourse(), 
				                             student.getStudentFeeDiscount());
		return count;
	}

	@Override
	public int updateStudent(Student student) {
		String sql = "UPDATE STUDENT SET SNAME=?,SFEE=?,SCOURSE=?,SFEEDISCOUNT=? WHERE SID=?";
		int count = jdbcTemplate.update(sql,  student.getStudentName(),
				                              student.getStudentFee(),
				                              student.getStudentCourse(),
				                              student.getStudentFeeDiscount(),
				                              student.getStudentId());

		return count;
	}

	
	  @Override
	  public int delectStudent(Integer id) {
	        String sql="DELETE FROM STUDENT WHERE SID=?";
	        int count=jdbcTemplate.update(sql,id);
	      return count; 
	  }
	  
	  @Override
	  public Student getOneStudent(Integer id) {
	        String sql="SELECT * FROM STUDENT WHERE SID=?";
	        Student studentData=jdbcTemplate.queryForObject(sql,(rs,count)->{
		                                          Student student=new Student();
		                                       student.setStudentId(rs.getInt("sid"));
		                                       student.setStudentName(rs.getString("sname"));
		                                       student.setStudentFee(rs.getDouble("sfee"));
		                                       student.setStudentCourse(rs.getString("scourse"));
		                                       student.setStudentFeeDiscount(rs.getDouble("sfeediscount"));
		                                   return student;
	                                      },
	        		                 id);
	      return studentData;
	  }
	  
	  @Override
	  public List<Student> getAllStudents() {
	  String sql="SELECT * FROM STUDENT";
	  List<Student> list=jdbcTemplate.query(sql, (rs,count)->{
		                                          Student student=new Student();
		                                       student.setStudentId(rs.getInt("sid"));
		                                       student.setStudentName(rs.getString("sname"));
		                                       student.setStudentFee(rs.getDouble("sfee"));
		                                       student.setStudentCourse(rs.getString("scourse"));
		                                       student.setStudentFeeDiscount(rs.getDouble("sfeediscount"));
		                                   return student;
	                                      });
	                                      
	         return list; 
	  }
	 
}
