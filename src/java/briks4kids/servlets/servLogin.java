package briks4kids.servlets;

import briks4kids.modelo.clases.usuario;
import briks4kids.modelo.conexion.ConexionMySQL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alvaro
 */
@WebServlet(name = "servLogin", urlPatterns = {"/controlLogin"})
public class servLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int tiempoSesion=30*60;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Tomar datos de logeo
        String user=request.getParameter("username");
        String pass=request.getParameter("userpass");
        
        HttpSession session = request.getSession();
        //se cuenta en segundos. por lo tanto 60 * x , dara x minutos.
        session.setMaxInactiveInterval(tiempoSesion);
        
        usuario usu=new usuario(user, pass);
        if (usu.autentica()){
            session.setAttribute("username", user);
            session.setAttribute("userpass", pass);
            Cookie userName = new Cookie("user", user);
            userName.setMaxAge(tiempoSesion);
            response.addCookie(userName);
            request.getSession().setAttribute("pagina", "paginaPrueba.jsp");
            response.sendRedirect("menuPrincipal.jsp");
        }else
            response.sendRedirect("errorLogin.jsp");
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
