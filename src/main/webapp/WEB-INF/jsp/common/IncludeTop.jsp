<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="stripes"
	uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<link rel="StyleSheet" href="../css/knowledges.css" type="text/css"
	media="screen" />

<meta name="generator"
	content="HTML Tidy for Linux/x86 (vers 1st November 2002), see www.w3.org" />
<title>knowledges Demo</title>
<meta content="text/html; charset=windows-1252"
	http-equiv="Content-Type" />
<meta http-equiv="Cache-Control" content="max-age=0" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="Pragma" content="no-cache" />
</head>

<body>

<div id="Header">

<div id="Logo">
<div id="LogoContent"><stripes:link
	beanclass="org.mybatis.knowledges.web.actions.KnowledgegActionBean">
</stripes:link></div>
</div>


<div id="Search">
<div id="SearchContent"><stripes:form
	beanclass="org.mybatis.knowledges.web.actions.KnowledgeActionBean">
	<stripes:text name="keyword" size="14" />
	<stripes:submit name="searchProducts" value="Search" />
</stripes:form></div>
</div>

</div>

<div id="Content"><stripes:messages />