package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author horac
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long> {
    
}
