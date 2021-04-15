package siva.bootjdbc.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import siva.bootjdbc.dao.StudentDao;


@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getAllStudentsCount() {
		String sql = "SELECT COUNT(*) FROM STUDENT";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

}
