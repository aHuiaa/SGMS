package model;

public class SLogin {

	private static int sid;
	private String spw;
	private String sname;

	public SLogin(int sid, String spw, String sname) {
		super();
		SLogin.sid = sid;
		this.spw = spw;
		this.sname = sname;
	}

	public static int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSpw() {
		return spw;
	}
	public void setSpw(String spw) {
		this.spw = spw;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}
