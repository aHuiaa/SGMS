package model;

public class AdLogin {
private  String adname;
private  String apsw;
public AdLogin(String adname, String apsw) {
	super();
	this.adname = adname;
	this.apsw = apsw;
}

public String getAdname() {
	return adname;
}
public void setAdname(String adname) {
	this.adname = adname;
}
public String getApsw() {
	return apsw;
}
public void setApsw(String apsw) {
	this.apsw = apsw;
}

}
