package briks4kids.modelo.conexion;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
/**
 *
 * @author Alvaro
 */

public class ConexionMySQL {
    
    // DATOS DE CONEXCION A LA BASE DE DATOS 
    private static final String USERNAME="root"; 
    private static final String PASSWORD="";
    private static final String HOST="localhost";
    private static final String PORT="3306";
    private static final String DATABASE="briks";
    private static final String CLASSNAME="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;

    private java.sql.Connection con;
    
    //PARA SINGLETON
    private static ConexionMySQL instancia=null;
    
    private ConexionMySQL() {
        try{
            Class.forName(CLASSNAME);
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(ClassNotFoundException e){
            System.out.println("Error clase");
        }catch(SQLException e){
            System.out.println("Error sql");
        }
    }
    
    public static ConexionMySQL getInstance() {
        //Verificar si ya existe una instancia
        if (instancia == null) {
            instancia = new ConexionMySQL();
        }
        return instancia;
    }
    
    public java.sql.Connection getCon() {
        return con;
    }   
    
    
    
    //*************Prueba la conexion al hacer boton derecho y correr solo el archivo***********
    /*public static void main (String[] args){
        Conexion con=Conexion.getInstance();
    }*/

}
