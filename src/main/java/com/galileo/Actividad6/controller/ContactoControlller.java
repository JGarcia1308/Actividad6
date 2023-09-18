package com.galileo.Actividad6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galileo.Actividad6.service.ContactoService;
import com.galileo.Actividad6.model.Contacto;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoControlller {
    private ContactoService contactoService;
    ContactoControlller(ContactoService contactoService){
        this.contactoService = contactoService;
    }

    @GetMapping
    public List<Contacto> getAll(){
        return this.contactoService.list();
    }

    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto){
        return this.contactoService.add(contacto);
    }
}
