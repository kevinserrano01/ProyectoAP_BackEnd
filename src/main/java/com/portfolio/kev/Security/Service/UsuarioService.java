package com.portfolio.kev.Security.Service;

import com.portfolio.kev.Security.Entity.Usuario;
import com.portfolio.kev.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author kevin serrano
 */
@Service
@Transactional // persistencia por si alguna operacion falla y que te mantenga en la DB.
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.finByNombreUsuario(nombreUsuario);
    }
    
    // Chequea si existe un usuario
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    // Chequea si existe ese email
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
//    Crea un usuario nuevo
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
