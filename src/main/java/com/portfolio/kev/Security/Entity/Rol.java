package com.portfolio.kev.Security.Entity;

import com.portfolio.kev.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kevin serrano
 */

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING) // Notacion que define los valores que vamos a ingresar son strings
    private RolNombre rolNombre;
    
//    constructor
    public Rol() {}

    public Rol(int id, RolNombre rolNombre) {
        this.id = id;
        this.rolNombre = rolNombre;
    }
    
//    Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
}
