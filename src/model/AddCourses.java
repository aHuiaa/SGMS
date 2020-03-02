package model;

public class AddCourses {
	private int cid;
	private String cname;
	private String cteacher;
	private String ctime;
	private String state;

	public AddCourses(int cid, String cname, String cteacher, String ctime,
			String state) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cteacher = cteacher;
		this.ctime = ctime;
		this.state = state;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCteacher() {
		return cteacher;
	}

	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
