package com.shokura.personalstudy.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.shokura.personalstudy.dto.LoginDTO;

/**
 * LoginDAO
 * ユーザー情報をDBから取得するクラス
 * @author HIDEKI KUDO
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
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "personalstudy", "root",
				"mysql");
		LoginDTO dto = new LoginDTO();
		String sql = "select * from user where user_name=? and password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			System.out.println(name);
			System.out.println(password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return dto;
	}

}