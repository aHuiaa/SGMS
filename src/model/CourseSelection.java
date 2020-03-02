package model;

public class CourseSelection {
	private String cname;
	private String ctime;
	private int stuId;
	private String stuName;
	private String sex;
	private String department;
	private String stuClass;
	public CourseSelection(String cname, String ctime, int stuId,
			String stuName, String sex, String department, String stuClass) {
		super();
		this.cname = cname;
		this.ctime = ctime;
		this.stuId = stuId;
		this.stuName = stuName;
		this.sex = sex;
		this.department = department;
		this.stuClass = stuClass;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
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
