package model;

import java.sql.*;

public class DataConnection {
	private static Statement stat;
	private static PreparedStatement pstat;
	private static Connection con;
//Êý¾Ý¿âÁ´½Ó
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3307/Mysql?"+
		"user=root&password=123456";
		con = DriverManager.getConnection(url);
		con.createStatement().executeUpdate("use gradesystem");
		}
	
	public static Statement getStat() throws SQLException, ClassNotFoundException {
		if(stat == null){
			init();
			stat = con.createStatement();
		}
		return stat;
	}
	public static Statement getpstat(String sql) throws ClassNotFoundException, SQLException{
		if(con == null){
			init();
		}
		pstat = con.prepareStatement(sql);
		return pstat;
	}

}
