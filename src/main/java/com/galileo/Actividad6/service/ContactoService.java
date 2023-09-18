package com.galileo.Actividad6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galileo.Actividad6.model.Contacto;
import com.galileo.Actividad6.model.repository.ContactoRepository;

import java.util.List;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;
    public Contacto add(Contacto contacto){
        return this.contactoRepository.save(contacto);
    }
    public List<Contacto> list(){
        return this.contactoRepository.findAll();
    }

}
