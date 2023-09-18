package com.galileo.Actividad6.model.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.galileo.Actividad6.model.Contacto;

public interface ContactoRepository extends CrudRepository<Contacto, Integer>{    
    List<Contacto> findAll();
}