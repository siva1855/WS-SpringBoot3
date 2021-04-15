package siva.bootjdbc.model;

public class Student {

	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private String studentCourse;
	private Double studentFeeDiscount;

	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, Double studentFee, String studentCourse,
			Double studentFeeDiscount) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentCourse = studentCourse;
		this.studentFeeDiscount = studentFeeDiscount;
	}



	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Double getStudentFeeDiscount() {
		return studentFeeDiscount;
	}

	public void setStudentFeeDiscount(Double studentFeeDiscount) {
		this.studentFeeDiscount = studentFeeDiscount;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentCourse=" + studentCourse + ", studentFeeDiscount=" + studentFeeDiscount + "]";
	}

}
