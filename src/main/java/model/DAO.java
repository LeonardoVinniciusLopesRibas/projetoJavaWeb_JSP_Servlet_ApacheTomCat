package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	//MODULO DE CONEXAO
	//PARAMETROS DE CONEXAO
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTime=UTC";
	private String user = "root";
	private String password = "CP1205RM3M1";
	
	// METODOS DE CONEXAO
	
	
	private Connection conectar() {
	
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//TESTE DE CONEXAO
	
	/*public void testeConection() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}*/
}
