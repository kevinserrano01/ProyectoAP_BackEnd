package com.portfolio.kev.Interface;

import com.portfolio.kev.Entity.Persona;
import java.util.List;

/**
 *
 * @author kevin serrano
 */
public interface IPersonaService {
//    Traer una lista de personas
    public List<Persona> getPersona();
    
//    Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
//    Eliminar un usuario
    public void deletePersona(Long id);
    
//    Buscar una persona por ID
    public Persona findPersona(Long id);
}
