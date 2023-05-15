package com.portfolio.kev.Repository;
import com.portfolio.kev.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kevin serrano
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
