/**
 *
 */
package com.shokura.personalstudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shokura.personalstudy.util.DBConnector;

/**
 * ユーザーテーブルに接続する為のクラス
 * @author Shogo Kurachi
 * @since 2016/06/28
 * @version 1.0
 */
public class UserDAO {

	/**
	 * <p>ユーザーログイン判定<br>
	 * ログインIDとパスワードが存在し、かつ削除フラグがたっていないかを判定する</p>
	 * @author Shogo Kurachi
	 * @param loginId ログインID
	 * @param password パスワード
	 * @return result ログインできればtrue できなければfalse
	 */
	public boolean selectLogin(String loginId,String password ){
		boolean result = false;

		Connection con = new DBConnector().getConnection();

		// SQL文 login_idとpasswordで検索
		String sql = "select * form user where login_id=? and password=?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

}
