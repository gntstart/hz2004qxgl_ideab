/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-11 09:05:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

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

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/config.jsp", Long.valueOf(1486194780000L));
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


	BaseUser u = BaseContext.getBaseUser();

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>??????????????????</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/report_style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"js/ext/css/ext-all.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(SystemConfig.getSystemConfig("default_css"));
      out.write("\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t.imgfile {\r\n");
      out.write("\t    background-image:url(images/i1.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-exit {\r\n");
      out.write("\t    background-image:url(images/exit.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.otherfile {\r\n");
      out.write("\t    background-image:url(images/3.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-expand-all {\r\n");
      out.write("\t    background-image: url(images/expand-all.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-collapse-all {\r\n");
      out.write("\t    background-image: url(images/collapse-all.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-expand-members {\r\n");
      out.write("\t    background-image: url(images/expand-members.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-hide-inherited {\r\n");
      out.write("\t    background-image: url(images/vty16.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t.icon-home {\r\n");
      out.write("\t    background-image: url(images/dq.gif) !important;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#word-status .x-status-text {\r\n");
      out.write("\t    color: #777;\r\n");
      out.write("\t}\r\n");
      out.write("\t#word-status .x-status-text-panel .spacer {\r\n");
      out.write("\t    width: 60px;\r\n");
      out.write("\t    font-size:0;\r\n");
      out.write("\t    line-height:0;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   \t<!-- Include Ext and app-specific scripts: -->\r\n");
      out.write("   \t<Script Lanaguage=\"JavaScript\">\r\n");
      out.write("   \t\tvar cfWin = null;\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\tvar user = {\r\n");
      out.write("\t\t\tusercode:'");
      out.print(u.getUser().getDlm());
      out.write("',\r\n");
      out.write("\t\t\tglyxm:'");
      out.print(u.getUser().getXm());
      out.write("',\r\n");
      out.write("\t\t\tdlsj:'");
      out.print(u.getLoginTime());
      out.write("'\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar jccode = '");
      out.print(SystemConfig.getSystemConfig("jccodeAppURL",""));
      out.write("';\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar funcs = [\r\n");
      out.write("        \t \t\t");

    				Map<String,String> p = new HashMap<String,String>();

    				int menucount = 0;
    				String menu = com.gnt.qxgl.common.BaseUser.getExtToolbarMenus(u.getFuncs(),"????????????",true,"JGRYGL",p);
    				if(menu!=null){
    					if(menucount>0) out.println(",'-',");
    					
    					out.println(menu);
    					menucount++;
    				}
    				
    				menu = com.gnt.qxgl.common.BaseUser.getExtToolbarMenus(u.getFuncs(),"????????????",true,"QXGLJSGL",p);
    				if(menu!=null){
    					if(menucount>0) out.println(",'-',");
    					
    					out.println(menu);
    					menucount++;
    				}
    				
    				if(menucount>0) out.println(",'-',");
        	 		
      out.write("\r\n");
      out.write("        \t \t\t'->', \r\n");
      out.write("\t\t\t\t\t");
if(u.checkFuncsAll("QXGLXGMM")){
      out.write("\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t                tooltip:'????????????',\r\n");
      out.write("\t\t                iconCls: 'icon-hide-inherited',\r\n");
      out.write("\t\t                handler : function(b, pressed){\r\n");
      out.write("\t\t                   cfWin.show();\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },'-',\r\n");
      out.write("\t\t            ");
}
      out.write("\r\n");
      out.write("\t\t            {\r\n");
      out.write("\t\t                tooltip:'??????/???????????????',\r\n");
      out.write("\t\t                iconCls: 'icon-expand-members',\r\n");
      out.write("\t\t                enableToggle: true,\r\n");
      out.write("\t\t                toggleHandler : function(b, pressed){\r\n");
      out.write("\t\t                    var st = Ext.get(\"word-status\");\r\n");
      out.write("\t\t                    if(pressed){\r\n");
      out.write("\t\t\t                    st.setVisibilityMode(Ext.Element.DISPLAY);\r\n");
      out.write("\t\t\t                    st.hide({\r\n");
      out.write("\t\t\t                    \tduration:1,\r\n");
      out.write("\t\t\t                    \tcallback:function(){\r\n");
      out.write("\t\t\t                    \t\t Ext.getCmp(\"vp\").doLayout();\r\n");
      out.write("\t\t\t                    \t}\r\n");
      out.write("\t\t\t                    });\r\n");
      out.write("\t\t                    }else{\r\n");
      out.write("\t\t                    \tst.show(true);\r\n");
      out.write("\t\t                    \tExt.getCmp(\"vp\").doLayout();\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },'-',{\r\n");
      out.write("\t\t                tooltip:'????????????',\r\n");
      out.write("\t\t                iconCls: 'icon-exit',\r\n");
      out.write("\t\t                handler: function(b, pressed){\r\n");
      out.write("\t\t                \tExt.Msg.show({\r\n");
      out.write("\t\t\t\t\t\t\t   title:'????????????',\r\n");
      out.write("\t\t\t\t\t\t\t   msg: '???????????????????????????',\r\n");
      out.write("\t\t\t\t\t\t\t   buttons: Ext.Msg.YESNO,\r\n");
      out.write("\t\t\t\t\t\t\t   fn: function(btn, text){\r\n");
      out.write("\t\t\t\t\t\t\t   \t\tif(btn==\"yes\"){\r\n");
      out.write("\t\t\t\t\t\t\t   \t\t\tdocument.location.href = \"login.jsp?op=logout\"\r\n");
      out.write("\t\t\t\t\t\t\t   \t\t}\r\n");
      out.write("\t\t\t\t\t\t\t   },\r\n");
      out.write("\t\t\t\t\t\t\t   animEl: Ext.getBody(),\r\n");
      out.write("\t\t\t\t\t\t\t   icon: Ext.MessageBox.QUESTION\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            }\r\n");
      out.write("        \t \t];\r\n");
      out.write("   \t</Script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ext/ext.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"index.js\"></script>\t\r\n");
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
