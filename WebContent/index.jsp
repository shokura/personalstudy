<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="LoginAction">
		<!--< name＝java側に値を持っていく為の変数  label=ラベル placeholder="taro"初期表示する内容 required="required"入力必須/>-->
		<p>
			ログインID
			<s:textfield name="name" placeholder="taro" required="required" />
		</p>
		<!--< name＝java側に値を持っていく為の変数  label=ラベル placeholder="taro"初期表示する内容 required="required"入力必須/>-->
		<p>
			パスワード
			<s:password name="password" placeholder="123" required="required" />
		</p>
		<!-- align=配置指定 左寄せ value=ボタン名-->
		<p>
			<s:submit align="left" value="ログイン" />
		</p>
	</s:form>

</body>
</html>