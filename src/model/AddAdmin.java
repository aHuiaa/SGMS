package model;

import java.sql.Statement;
import java.util.ArrayList;

public class AddAdmin {
private String adname;
private String adpsw;
public AddAdmin(String adname, String adpsw) {
	super();
	this.adname = adname;
	this.adpsw = adpsw;
}
public String getAdname() {
	return adname;
}
public void setAdname(String adname) {
	this.adname = adname;
}
public String getAdpsw() {
	return adpsw;
}
public void setAdpsw(String adpsw) {
	this.adpsw = adpsw;
}


}
