package com.portfolio.kev.Security.Service;

import com.portfolio.kev.Security.Entity.Rol;
import com.portfolio.kev.Security.Enums.RolNombre;
import com.portfolio.kev.Security.Repository.iRolRepository;
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
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
