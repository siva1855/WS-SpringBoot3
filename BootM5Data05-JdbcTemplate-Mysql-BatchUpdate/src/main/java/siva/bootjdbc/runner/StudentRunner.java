package siva.bootjdbc.runner;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siva.bootjdbc.model.Student;
import siva.bootjdbc.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
	
	 studentService.insertStudents(Arrays.asList(new Student(1,"Siva",100.0,"java",10.0),
				                                  new Student(2,"Cherry",200.0,"Boot",20.0),
				                                  new Student(3,"Milky",300.0,"Spring",30.0),
				                                  new Student(4,"Saidarao",400.0,"MicroServices",40.0),
				                                  new Student(5,"Ramadevi",500.0,"Angular",50.0)));
				                                  
	         
	  System.out.println("Records are inserted");
	}

}
