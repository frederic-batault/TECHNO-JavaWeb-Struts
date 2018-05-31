<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Welcome To Struts 2!</h1>
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>
	<s:url action="hello" var="helloLink">
		<s:param name="userName">Bruce Phillips</s:param>
	</s:url>

	<p>
		<a href="${helloLink}">Hello Bruce Phillips</a>
	</p>
	<p>Get your own personal hello by filling out and submitting this
		form.</p>

	<s:form action="hello">
		<s:textfield name="userName" label="Your name" />
		<s:submit value="Submit" />
	</s:form>
	<s:url action="registerInput" var="registerInputLink" />
	<p>
		<a href="${registerInputLink}">Please register</a> for our prize
		drawing.
	</p>
	<h3>S'enregistrer (français)</h3>
	<s:url action="registerInput" var="registerInputLinkFR">
		<s:param name="request_locale">fr</s:param>
	</s:url>
	<p>
		<a href="${registerInputLinkFR}">Veuillez vous enregister</a> pour
		participer à notre lotterie
	</p>

	<a href='<s:url action="index" namespace="config-browser" />'>Launch
		the configuration browser</a>

	<hr />
	<s:text name="contact" />

</body>
</html>