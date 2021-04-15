package siva.bootjdbc.util;

import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import siva.bootjdbc.model.Student;

@Component
public class StudentExcelUtil {

	public boolean writeDataToExcel(List<Student> listStudent) {
		boolean status = false;
		try {
			// 1. create new WorkBook
			Workbook workbook = new XSSFWorkbook();
			// 2. create new Sheet
			Sheet sheet = workbook.createSheet("STUDENTSDATA");
			// 3. Create Head and Body
			setHead(sheet);
			setBody(sheet, listStudent);
			// 4. write to one file
			workbook.write(new FileOutputStream("D:\\JavaWorkspaces\\WS-SpringBoot3\\useFiles\\StudentPullData.xlsx"));
			status = true;
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	private void setHead(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("FEE");
		row.createCell(3).setCellValue("COURSE");
		row.createCell(4).setCellValue("DISCOUNT");
	}

	private void setBody(Sheet sheet, List<Student> listStudent) {
		Row row = null;
		int count = 1;
		for (Student student : listStudent) {
			row = sheet.createRow(count++);
			row.createCell(0).setCellValue(student.getStudentId());
			row.createCell(1).setCellValue(student.getStudentName());
			row.createCell(2).setCellValue(student.getStudentFee());
			row.createCell(3).setCellValue(student.getStudentCourse());
			row.createCell(4).setCellValue(student.getStudentFeeDiscount());
		}
	}

	
}
