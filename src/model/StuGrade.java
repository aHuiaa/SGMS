package model;

public class StuGrade {
private String cname;
private String grade;
public StuGrade(String cname, String grade) {
	super();
	this.cname = cname;
	this.grade = grade;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}

}
