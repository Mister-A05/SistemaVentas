package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    
    public void crearUsuario(int id, String nombreUsuario, String contraseña, String rol){
        
        Usuario usu = new Usuario(id,nombreUsuario, contraseña, rol);
        controlPersis.crearUsuario(usu);
    }
    
}
