package com.shokura.personalstudy.dto;

/**
 * データーベースのデータを一時的に保持するクラス
 */
public class LoginDTO{

	/**
	 * ログインID
	 */
    private String loginId;

    /**
     *  パスワード
     */
    private String password;

	/**
	 * 取得メソッド
	 * ログインIDを取得する
	 * @author Shogo Kurachi
	 * @return loginId 取得するログインID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * 格納メソッド
	 * ログインIDを格納する
	 * @author Shogo Kurachi
	 * @param loginId セットするログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * 取得メソッド
	 * パスワードを取得する
	 * @author Shogo Kurachi
	 * @return  password 取得するパスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 格納メソッド
	 * パスワードを格納する
	 * @author Shogo Kurachi
	 * @param  password セットするパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}