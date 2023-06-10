package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import propBean.PropartyDataBean;

public class JDBCFunction {
	public void connectDB() {
		PropartyDataBean propBean = new PropartyDataBean();
		// TODO DB接続処理整備
		try {
			Connection conn = DriverManager.getConnection(propBean.getDBURL(), propBean.getDBUser(), propBean.getDBPass());
		} catch (SQLException e){
			;
		}
	}

}
