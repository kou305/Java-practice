package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import propBean.PropartyDataBean;

public class JDBCFunction {
	
	private Connection con = null;
	
	public Connection connectDB() {
		PropartyDataBean propBean = new PropartyDataBean();
		// TODO DB接続処理整備
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(propBean.getDBURL(), propBean.getDBUser(), propBean.getDBPass());
		} catch (SQLException e){
			;
		} catch (ClassNotFoundException e) {
			// TODO 例外処理実装
			System.out.println("ClassNotFoundException");
		}
		return con;
	}
	
	public void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 例外処理記述
				;
			}
		}
	}

}
