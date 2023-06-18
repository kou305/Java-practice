package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.M01Dto;
import function.JDBCFunction;

public class M01Dao {
	// TODO DB接続情報の読み込み方法変更。propBeanから読み込むように。
	private final String dBURL ="jdbc:postgresql:mydb";
	private final String dBUser ="postgres";
	private final String dBPass ="postgres";
	
	// TODO 引数と戻り値修正
	public M01Dto returnM01Dto() {
		Connection con = null;
		JDBCFunction jdbcFunction = new JDBCFunction();
		M01Dto m01Dto = new M01Dto();
		try {
			con = jdbcFunction.connectDB();
			String sql = "SELECT * FROM M01;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				m01Dto.setM_ID(rs.getString("m_id"));
				m01Dto.setSongTitle(rs.getString("songTitle"));
			}
		} catch (SQLException e2) {
			// TODO 例外処理実装
			System.out.println("SQLException");
		} finally {
			jdbcFunction.close();
		}
		return m01Dto;
	}

}
