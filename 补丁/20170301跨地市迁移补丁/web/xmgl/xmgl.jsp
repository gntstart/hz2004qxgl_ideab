<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file = "/config.jsp"%>
<%
	BaseUser u = BaseContext.getBaseUser();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>项目管理</title>
	<link rel="stylesheet" type="text/css" href="css/report_style.css">
    <link rel="stylesheet" type="text/css" href="js/ext/css/ext-all.css">
    <link rel="stylesheet" type="text/css" href="<%=SystemConfig.getSystemConfig("default_css")%>">
  </head>
  <body>
   	<!-- Include Ext and app-specific scripts: -->
    <script type="text/javascript" src="js/ext/ext.js"></script>
    <script type="text/javascript" src="js/pub.js"></script>
    
    <script type="text/javascript" src="xmgl/xmgl.js"></script>
  </body>
</html>
