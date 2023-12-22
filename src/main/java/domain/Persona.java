package domain;

public class Persona {
    //ATRIBUTOS DE LA CLASE
    private int idPersona;
    private String nombre;
    private String apellido;
    private String emalil;
    private String telefono;

    //CONSTRUCTOR
    public Persona() {
    }

    //SE SOBRECARGA EL CONSTRUCTOR CON EL ID PARA QUE AL ELIMINAR SOLO SE ENVÍE EL ID
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    //PARA INSERTAR UN NUEVO REGISTRO Y SE OMITE EL ID PUESTO QUE EN BASE DE DATOS ES AUTOINCREMENTAL
    public Persona(String nombre, String apellido, String emalil, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.emalil = emalil;
        this.telefono = telefono;
    }

    //PARA MODIFICAR UN REGISTRO ENTONCES SE ENVÍAN TODOS LOS ATRIBUTOS DE LA CLASE
    public Persona(int idPersona, String nombre, String apellido, String emalil, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.emalil = emalil;
        this.telefono = telefono;
    }

    //GETTERS Y SETTERS

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmalil() {
        return emalil;
    }

    public void setEmalil(String emalil) {
        this.emalil = emalil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", emalil='" + emalil + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}
