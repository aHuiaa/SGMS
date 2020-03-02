package model;

public class Grade {
	private int sid;
	private String sname;
	private String cname;
	private String ctime;
	private String grade;

	public Grade(int sid, String sname, String cname, String ctime, String grade) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cname = cname;
		this.grade = grade;
		this.ctime = ctime;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
