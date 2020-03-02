package model;

public class Teacher {
	private int tid;
	private String tpw;
	private String tname;
	private String tsex;
	public Teacher(int tid, String tpw, String tname, String tsex) {
		super();
		this.tid = tid;
		this.tpw = tpw;
		this.tname = tname;
		this.tsex = tsex;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTpw() {
		return tpw;
	}
	public void setTpw(String tpw) {
		this.tpw = tpw;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

}
