package briks4kids.modelo.clases;

public class nino {
    int id;
    String nombre;
    String apPaterno;
    String apMaterno;
    String telf;
    String celPapa;
    String celMama;
    String correoPapa;
    String correoMama;
    String observaciones;
    String fechaNacimiento;
    String fechaInscripcion;

    public nino(String nombre, String apPaterno, String apMaterno) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
    
    
}
