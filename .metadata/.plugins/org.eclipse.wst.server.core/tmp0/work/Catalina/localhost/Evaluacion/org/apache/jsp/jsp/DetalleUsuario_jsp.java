/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-01-21 05:41:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DetalleUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Workspace%20Evaluacion/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Evaluacion/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647135937704L));
    _jspx_dependants.put("jar:file:/C:/Workspace%20Evaluacion/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Evaluacion/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153403082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Ejercicio de Evaluacion</title>\r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script> \r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap1.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- LIBRERIA PARA IMAGENES Y JQUERY -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--  CSS BOOTSTRAP  y JQUERY-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap1.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery-ui-1.10.3.custom.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/jsjquery.min.js\"></script>\r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/bootbox.min.js\"></script>\r\n");
      out.write("<!--  JS JSGRID -->\r\n");
      out.write("<link rel='stylesheet prefetch' href=\"css/jsgrid.min.css\"/> \r\n");
      out.write("<link rel='stylesheet prefetch' href=\"css/jsgrid-theme.min.css\"/> \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jsgrid.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jsgrid.min.js\"></script> \r\n");
      out.write("<!--  JS BOOTSTRAP -->\r\n");
      out.write("<script  type=\"text/javascript\" src=\"js/bootstrap.js\"></script> 		\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\" />\r\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datatables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/datatables.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"css/dataTables.bootstrap4.min.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/catalogo.js\"></script>	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("  		<a class=\"navbar-brand\" href=\"\">Edita Usuario </a>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div>\r\n");
      out.write("		<img alt=\"imagenUsuario\" src=\"Images/usuarioLogo.png\" style=\"width: 80px;height:80px\">\r\n");
      out.write("		<form action=\"CatalogoUsuarios\" method=\"post\"> \r\n");
      out.write("			<br>\r\n");
      out.write("			Nombre: <br>\r\n");
      out.write("			<input type=\"text\" id=\"txtNombreAct\" name=\"txtNombreAct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nombre_usu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 80%\"> <br><br>\r\n");
      out.write("			Genero: <br>\r\n");
      out.write("			<input type=\"text\" id=\"txtGeneroAct\" name=\"txtGeneroAct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${genero_usu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 80%\"> <br><br>\r\n");
      out.write("			Email: <br>\r\n");
      out.write("			<input type=\"text\" id=\"txtEmailAct\" name=\"txtEmailAct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email_usu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 80%\"><button type=\"button\" onclick='addInput()'>+</button> <br><br>\r\n");
      out.write("			 <div id='input-cont'>\r\n");
      out.write("        \r\n");
      out.write("   		 	</div>\r\n");
      out.write("			<br>\r\n");
      out.write("			<input type=\"text\" id=\"txtCorreoAlternativo\" value=\"\" style=\"display:none\"> \r\n");
      out.write("			Estatus: <br>\r\n");
      out.write("			<select id=\"slcEstatusAct\" name=\"slcEstatusAct\" style=\"width: 80%\">\r\n");
      out.write("				<option  value=\"200\">Activo</option>\r\n");
      out.write("				<option  value=\"500\">Inactivo</option>\r\n");
      out.write("			</select>\r\n");
      out.write("			<br><br>\r\n");
      out.write("			Subir Archivo: <br>\r\n");
      out.write("			<input type=\"file\" style=\"border-color: rgb(44,184,10);\" name=\"imagenesActuImg[]\" accept=\"image/png, image/gif, image/jpeg\" id=\"fileImagenAct\" onchange=\" return validarImagenes(this)\">\r\n");
      out.write("			<div id=\"preview\" width=\"100%\" height=\"100%\"></div>\r\n");
      out.write("			<br><br>\r\n");
      out.write("			<input type=\"hidden\" id=\"idUsuAct\" name=\"idUsuAct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id_usu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">  \r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-info btn-lg btn-block\">Actualizar</button>\r\n");
      out.write("			<input type=\"hidden\" id=\"vista\" name=\"vista\" value=\"ActualizaUsuario\"> \r\n");
      out.write("		</form>\r\n");
      out.write("		<br>\r\n");
      out.write("		<form action=\"CatalogoUsuarios\" method=\"post\">\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-warning btn-lg btn-block\">Cancelar</button>\r\n");
      out.write("			<input type=\"hidden\" id=\"vista\" name=\"vista\" value=\"regresarCatalogo\">\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<script>\r\n");
      out.write("        const container = document.getElementById('input-cont');\r\n");
      out.write("\r\n");
      out.write("        // Call addInput() function on button click\r\n");
      out.write("        function addInput(){\r\n");
      out.write("            let input = document.createElement('input');\r\n");
      out.write("            input.placeholder = 'Otro Correo';\r\n");
      out.write("            container.appendChild(input);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function limpiaCampos(){\r\n");
      out.write("        	$('#input-cont').val('');\r\n");
      out.write("        	\r\n");
      out.write("        }\r\n");
      out.write("</script>		\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
