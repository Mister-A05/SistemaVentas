
package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class Usuario implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_Usuario;
    private String nombreUsuario;
    private String Contraseña;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String nombreUsuario, String Contraseña, String rol) {
        this.id_Usuario = id_Usuario;
        this.nombreUsuario = nombreUsuario;
        this.Contraseña = Contraseña;
        this.rol = rol;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
