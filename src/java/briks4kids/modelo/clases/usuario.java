package briks4kids.modelo.clases;

import briks4kids.modelo.mysql.mysqlUsuario;
import briks4kids.modelo.repositorios.repoUsuario;

/**
 *
 * @author Alvaro
 */
public class usuario {
    int id;
    String nombre;
    String telefono;
    String celular;
    String email;
    String nacimiento;
    String username;
    String clave;
    
    repoUsuario repository=new mysqlUsuario();

    public usuario(String username, String clave) {
        this.username = username;
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean autentica() {
        return repository.autenticaUsuario(this);
    }
    
    
    
}
