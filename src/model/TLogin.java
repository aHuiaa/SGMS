package model;

public class TLogin {
	private static int tid;
	private String tpw;
	private static String tname;

	public TLogin(int tid, String tpw, String tname) {
		super();
		TLogin.tid = tid;
		this.tpw = tpw;
		TLogin.tname = tname;
	}

	public static int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		TLogin.tid = tid;
	}

	public String getTpw() {
		return tpw;
	}

	public void setTpw(String tpw) {
		this.tpw = tpw;
	}

	public static  String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

}
