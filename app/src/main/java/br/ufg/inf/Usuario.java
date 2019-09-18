package com.netfanely.erlifegov02;

public class Usuario {
    int Id;
    String Nombre, Apellidos, Usuario, Password;

/* Constructores */
    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String usuario, String password) {
        Nombre = nombre;
        Apellidos = apellidos;
        Usuario = usuario;
        Password = password;
    }
    
/* Metodo isNull, para validar los campos vacios*/
    
    public boolean isNull(){
        if(Nombre.equals("")&&Apellidos.equals("")&&Usuario.equals("")&&Password.equals("")){
            return false;
        }else{
            return true;
        }
    }
    
/* toString */
    
    @Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
    
/* Getter and Setter*/
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
