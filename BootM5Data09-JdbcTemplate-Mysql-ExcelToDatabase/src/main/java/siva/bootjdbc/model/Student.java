package siva.bootjdbc.model;

public class Student {

	private int studentId;
	private String studentName;
	private double studentFee;
	private String studentCourse;
	private double studentFeeDiscount;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, double studentFee, String studentCourse,
			double studentFeeDiscount) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentCourse = studentCourse;
		this.studentFeeDiscount = studentFeeDiscount;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public double getStudentFeeDiscount() {
		return studentFeeDiscount;
	}
	public void setStudentFeeDiscount(double studentFeeDiscount) {
		this.studentFeeDiscount = studentFeeDiscount;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentCourse=" + studentCourse + ", studentFeeDiscount=" + studentFeeDiscount + "]";
	}

	

}
