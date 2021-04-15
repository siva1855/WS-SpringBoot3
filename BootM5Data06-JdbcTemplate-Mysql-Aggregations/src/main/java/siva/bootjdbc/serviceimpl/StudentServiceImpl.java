package siva.bootjdbc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siva.bootjdbc.dao.StudentDao;
import siva.bootjdbc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public int getAllStudentsSum() {
		return studentDao.getAllStudentsCount();
	}

}
