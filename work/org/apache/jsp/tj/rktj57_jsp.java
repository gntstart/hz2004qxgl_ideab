/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-11 09:06:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tj;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.net.*;
import com.gnt.qxgl.service.*;
import com.gnt.qxgl.hz2004.entity.*;
import com.gnt.qxgl.bean.*;
import com.gnt.qxgl.base.*;
import com.gnt.qxgl.base.util.*;
import com.gnt.qxgl.common.util.*;
import com.gnt.qxgl.common.*;

public final class rktj57_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/tj/../config.jsp", Long.valueOf(1486194780000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.net");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.gnt.qxgl.hz2004.entity");
    _jspx_imports_packages.add("com.gnt.qxgl.bean");
    _jspx_imports_packages.add("com.gnt.qxgl.base");
    _jspx_imports_packages.add("com.gnt.qxgl.common.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.gnt.qxgl.base.util");
    _jspx_imports_packages.add("com.gnt.qxgl.common");
    _jspx_imports_packages.add("com.gnt.qxgl.service");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ path+"/";

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  \t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \t<title>统计</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/report_style.css\">\r\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"js/ext/css/ext-all.css\">\r\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"js/ext/css/xtheme-gray.css\">\r\n");
      out.write("    \t<style type=\"text/css\">\r\n");
      out.write("\t.otherfile {\r\n");
      out.write("\t    background-image:url(images/3.gif) !important;\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    .x-grid3-header-offset {\r\n");
      out.write("\t\t    width: auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ux-grid-hd-group-cell {\r\n");
      out.write("\t\t    background: url(../resources/images/default/grid/grid3-hrow.gif) repeat-x bottom;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   \t<!-- Include Ext and app-specific scripts: -->\r\n");
      out.write("   \t<Script Lanaguage=\"JavaScript\">\r\n");
      out.write("   \t\tvar contextPath = \"");
      out.print(path);
      out.write("\";\r\n");
      out.write("   \t</Script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ext/ext.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ext/ColumnHeaderGroup.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ext/GroupHeaderPlugin.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/commFrames2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/RktjStore57.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/RktjGrid57.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"tj/ExportExcel57.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"tj/rktj57.js\"></script>\t\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
