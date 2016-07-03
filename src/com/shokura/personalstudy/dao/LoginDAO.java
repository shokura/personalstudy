package com.shokura.personalstudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shokura.personalstudy.dto.LoginDTO;
import com.shokura.personalstudy.util.DBConnector;


public class LoginDAO {
	public LoginDTO select(String name, String password){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();
		String sql = "select * from user where user_name=? and password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			System.out.println(name);
			System.out.println(password);


			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		} catch (SQLException e){
			System.out.println("SQLExceptionが発生しました");
		} finally {
			try {
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}

		return dto;
	}

}