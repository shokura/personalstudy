package com.shokura.personalstudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.shokura.personalstudy.dto.LoginDTO;

/**
 * LoginDAO
 * ユーザー情報をDBから取得するクラス
 * @author Shogo Kurachi
 * @since 2016/06/22
 * @version 1.0
 */
public class LoginDAO {
	/**
	 * 指定されたユーザー情報がDBに存在するか調べる
	 * @author Shogo Kurachi
	 * @param loginId
	 *             ログインID
	 * @param password
	 *             パスワード
	 * @return dto データが存在すればnull以外、存在しなければnull
	 */
	public LoginDTO select(String loginId, String password) {

		LoginDTO dto = null;

        Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","personalstudy","root","mysql").getConnection();

		String sql = "select * from user where user_name=? and password=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, loginId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery(); // 取得した行などの情報を格納

			if (rs.next()) {
				dto = new LoginDTO();
				// 行からデータを取得
				// dtoに格納（指定のカラムの値を取得）
				dto.setLoginId(rs.getString("login_id"));
				dto.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// リソースを開放
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return dto;
	}

}