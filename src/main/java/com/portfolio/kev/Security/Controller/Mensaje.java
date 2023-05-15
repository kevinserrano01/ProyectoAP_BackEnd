package com.portfolio.kev.Security.Controller;
/**
 *
 * @author kevin serrano
 */
public class Mensaje {

    private String mensaje;
    
    //Contructor
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getter y Setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
