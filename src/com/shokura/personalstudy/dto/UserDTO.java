package com.shokura.personalstudy.dto;

public class UserDTO {

	private String loginId;

	private int password;

	/**
	 * を取得する
	 * @author Shogo Kurachi
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * をセットする
	 * @author Shogo Kurachi
	 * @param loginId loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * を取得する
	 * @author Shogo Kurachi
	 * @return password
	 */
	public int getPassword() {
		return password;
	}

	/**
	 * をセットする
	 * @author Shogo Kurachi
	 * @param password password
	 */
	public void setPassword(int password) {
		this.password = password;
	}


}
