package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class M01Dao {
	// TODO DB接続情報の読み込み方法変更。propBeanから読み込むように。
	private final String dBURL ="jdbc:postgresql:mydb";
	private final String dBUser ="postgres";
	private final String dBPass ="postgres";
	
	// TODO 引数と戻り値修正
	public void returnM01() {
		Connection con = null;
		try {
			// TODO FQCNを定数定義
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dBURL, dBUser, dBPass);
			
			String sql = "SELECT * FROM M01;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String mID = rs.getString("m_id");
				System.out.println(mID);
				String songTitle = rs.getString("songTitle");
				System.out.println(songTitle);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO 例外処理実装
			System.out.println("ClassNotFoundException");
		} catch (SQLException e2) {
			// TODO 例外処理実装
			System.out.println("SQLException");
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("SQLException(後ろ)");
					;
				}
			}
		}
	}



}
