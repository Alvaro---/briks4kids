<%-- 
    Document   : menuPrincipal
    Created on : 29-05-2015, 05:26:19 PM
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilo.css" />
    </head>
    <body>
        <%
        //PERMITE ACCESO SOLO SI EXISTE LA SESION
            String user = null;
            if(session.getAttribute("username") == null){
                response.sendRedirect("index.jsp");
            }else user = (String) session.getAttribute("username");
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();
            if(cookies !=null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("user")) userName = cookie.getValue();
                    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
                }
            }
        %>
        
        <% String paginaCentral=(String)session.getAttribute("pagina"); %>
       <!-- <h1>Hello World! <%=userName %>, Login successful. Your Session ID=<%=sessionID %> </h1> -->
        
        <h1>Bienvenido: </h1>
               
        <nav id="menu">
            <ul>
                <li class="nivel1"><a href="#">Inicio</a></li>
                <li class="nivel1"><a href="seleccionMenu1?pag=usuarios/Usuarios.jsp">Usuarios</a>
                    <ul>
                        <li><a href="#">Crear Usuario</a></li>
                        <li><a href="#">Modificar Usuarios</a></li>
                        <li><a href="#">Eliminar Usuarios</a></li>
                    </ul>
                </li>
                <li class="nivel1"><a href="seleccionMenu1?pag=ninos/ninos.jsp">Niños</a>
                    <ul>
                        <li><a href="seleccionMenu1?pag=ninos/registrarNino.jsp">Inscribir Niño</a>
                        <li><a href="#">Verificar Datos</a>
                    </ul>
                </li>
                <li class="nivel1"><a href="#">Materias</a>
                <li class="nivel1"><a href="#">Modelos</a></li>
                <li class="nivel1"><a href="#">Horarios</a></li>
            </ul>
            
        </nav>
        
        <br>
        <br>
        <hr> 
        <div>
            <jsp:include page="<%=paginaCentral%>"/>
        </div>
        <hr>
        <footer>
        <a href="logoutServlet" title="Cerrar sesión">Cerrar Sesion</a>
        </footer>
        
    </body>
</html>
