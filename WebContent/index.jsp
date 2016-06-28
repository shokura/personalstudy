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
		<!--< name＝java側に値を持っていく為の変数 value=テキストフィールド内 label=ラベル />-->
		<s:textfield name="name" value="" label="ユーザー" />
		<!--< name＝java側に値を持っていく為の変数 value=テキストフィールド内 label=ラベル />-->
		<s:textfield name="password" value="" label="パスワード" />

		<!-- align=配置指定 左寄せ value=ボタン名-->
		<s:submit align="left" value="ログイン" />
	</s:form>
</body>
</html>