package model;

public class AddStudent {
private int stuId;
private String stupsw;
private String stuName;
private String sex;
private String department;
private String stuClass;
public AddStudent(int stuId, String stupsw, String stuName, String sex,
		String department, String stuClass) {
	super();
	this.stuId = stuId;
	this.stupsw = stupsw;
	this.stuName = stuName;
	this.sex = sex;
	this.department = department;
	this.stuClass = stuClass;
}
public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStupsw() {
	return stupsw;
}
public void setStupsw(String stupsw) {
	this.stupsw = stupsw;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getStuClass() {
	return stuClass;
}
public void setStuClass(String stuClass) {
	this.stuClass = stuClass;
}

}
