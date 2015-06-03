package briks4kids.modelo.mysql;

import briks4kids.modelo.clases.usuario;
import briks4kids.modelo.conexion.ConexionMySQL;
import briks4kids.modelo.repositorios.repoUsuario;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alvaro
 */
public class mysqlUsuario implements repoUsuario{
    
    //valores de usuario
    String USERNAME="username";
    String CLAVE="clave";
    
    @Override
    public boolean autenticaUsuario(usuario usuario) {
        ConexionMySQL con=ConexionMySQL.getInstance();
        Statement st;
        ResultSet rs=null;
        String consulta="select * from usuarios";
        System.out.println(consulta);
        try {
            st = con.getCon().createStatement();
            rs=st.executeQuery(consulta);
            while (rs.next()){
                if (rs.getString(USERNAME).equals(usuario.getUsername()) && rs.getString(CLAVE).equals(usuario.getClave()))
                    return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(mysqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: "+ex);
            return false;
        }
       return false;
    }
    
}
