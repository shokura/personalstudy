package com.shokura.personalstudy.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーログイン認証クラス
 * @author Shogo Kurachi
 * @since 2016/06/28
 * @version 1.0
 */
public class GoLoginAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -8957391474053205643L;

	/**
	 * 入力されたユーザーID
	 */
	private String loginId;

	/**
	 * 入力されたパスワード
	 */
	private String password;

	/**
	 * セッションを格納
	 */
	private Map<String, Object> session;

	/**
	 * ログイン結果を出力
	 *
	 * @author Shogo Kurachi
	 * @return ログインに成功したらSUCCESS 失敗したらERROR
	 */
	public String execute() {

		String result = ERROR;
		result = SUCCESS;
		return result;
	}

	/**
	 * ログインIDを取得する
	 *
	 * @author Shogo Kurachi
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * ログインIDをセットする
	 *
	 * @author Shogo Kurachi
	 * @param loginId
	 *            ログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * パスワードを取得する
	 *
	 * @author Shogo Kurachi
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードをセットする
	 *
	 * @author Shogo Kurachi
	 * @param password
	 *            パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * セッションを取得する
	 *
	 * @author Shogo Kurachi
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションをセットする
	 *
	 * @author Shogo Kurachi
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
