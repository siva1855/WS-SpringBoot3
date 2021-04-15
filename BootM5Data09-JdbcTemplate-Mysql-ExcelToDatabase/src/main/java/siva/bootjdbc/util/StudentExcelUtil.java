package siva.bootjdbc.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import siva.bootjdbc.model.Student;

@Component
public class StudentExcelUtil {

	public List<Student> readFromExcel() {
		
		
		List<Student> listStudent=null;
		try {
			listStudent=new ArrayList<>();
			//1. read Excel File as Workbook
			File file=new File("D:\\JavaWorkspaces\\WS-SpringBoot3\\useFiles\\StudentPushData.xlsx");
			Workbook book=new XSSFWorkbook(file);
			//2. Read Sheet 'STUDENTS'
			Sheet sheet= book.getSheet("STUDENTS");
			//3. read rows
			Iterator<Row> iterator=sheet.iterator();
			while (iterator.hasNext()) {
				Row row=iterator.next();
				//Read Data from one row-> Student obj
				//->added to List stds
				listStudent.add(
						new Student((int) row.getCell(0).getNumericCellValue(),
								row.getCell(1).getStringCellValue(),
								row.getCell(2).getNumericCellValue(),
								row.getCell(3).getStringCellValue(),
								row.getCell(4).getNumericCellValue()));
			}
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listStudent;
	}

}
