package com.shokura.personalstudy.action;

import java.util.Map;

/**
 * AdminLoginAction
 * 管理者ログイン認証クラス
 * @author Shogo Kurachi
 * @since 2016/07/22
 * @version 1.0
 */
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.shokura.personalstudy.dao.LoginDAO;
import com.shokura.personalstudy.dto.LoginDTO;
public class LoginAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -8957391474053205643L;

	/**
	 * 入力されたユーザー名
	 */
	private String loginId;

	/**
	 * 入力されたパスワード
	 */
    private String password;

	/**
	 * セッションを格納
	 */
    private Map<String,Object> session;

	/**
	 * 実行メソッド
	 * DAOに入力されたアカウント情報を渡してresultを返す
	 * @author Shogo Kurachi
	 * @return result 認証に成功したらSUCCESS、失敗したらERROR
	 */
    public String execute(){
		String result = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = dao.select(loginId, password);
		if(dto != null){
			session.put("LoginId", dto.getLoginId());
			session.put("password", dto.getPassword());
			result = SUCCESS;
		}
		return result;
    }


	/**
	 * 取得メソッド
	 * ログインIDを取得
	 * @author Shogo Kurachi
	 * @return loginId 取得するログインID
	 */
    public String getLoginId() {
		return loginId;
	}

	/**
	 * 格納メソッド
	 * ログインIDを格納
	 * @author Shogo Kurachi
	 * @param loginId 格納するログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * 取得メソッド
	 * パスワードを取得
	 * @author Shogo Kurachi
	 * @return password 取得するパスワード
	 */
	public String getPassword() {
        return password;
    }

	/**
	 * 格納メソッド
	 * パスワードを格納
	 * @author Shogo Kurachi
	 * @param password 格納するパスワード
	 */
    public void setPassword(String password){
        this.password = password;
    }

	/**
	 * 取得メソッド
	 * セッションを取得
	 * @author Shogo Kurach
	 * @return session 取得するセッション
	 */
    public Map<String, Object> getSession(){
        return session;
    }

	/**
	 * 格納メソッド
	 * セッションを格納
	 * @author Shogo Kurach
	 * @param session 格納するセッション
	 */
    public void setSession(Map<String, Object> session){
        this.session = session;
    }
}
