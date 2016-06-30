package com.shokura.personalstudy.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.shokura.personalstudy.dao.UserDAO;
import com.shokura.personalstudy.dto.UserDTO;

public class LoginAction extends ActionSupport implements SessionAware  {


	/**
	 * シリアル・バージョンID
	 */
	private static final long serialVersionUID = 420037853825991687L;

	/**
	 * 入力されたユーザーID
	 */
	private String loginId;

	/**
	 * 入力されたパスワード
	 */
	private String password;

	/**
	 * エラーメッセージ
	 */
	private String errorMessagge;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * DAOにログイン情報を渡して結果を返す
	 *
	 * @author SHOGO KURACHI
	 * @return ログインンに成功したらSUCCESS 失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		UserDAO dao = new UserDAO();
		UserDTO dto = new UserDTO();

		boolean res = dao.select(loginId, password);
		if (res) {
			session.put("loginId", dto.getLoginId());
			result = SUCCESS;
		}else{
			errorMessagge = getText("ログインIDまたはパスワードが間違ってます");
		}
		return result;
	}

	/**
	 * セッションを取得するメソッド
	 * @author Shogo Kurachi
	 * @since  2015/07/03
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 * @author Shogo Kurachi
	 * @since  2015/07/03
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
