package com.galileo.Actividad6.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController implements ErrorController{

    
    @RequestMapping("/error")
    @ResponseBody
    public String error() {
        String html ="<!DOCTYPE html>\r\n" + //
                "<html lang=\"en\">\r\n" + //
                "<head>\r\n" + //
                "    <meta charset=\"UTF-8\">\r\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                "    <title>Bienvenido</title>\r\n" + //
                "</head>\r\n" + //
                "<body>\r\n" + //
                "    <div>\r\n" + //
                "        <img src=\"https://www.galileo.edu/wp-content/themes/galileo-theme/img/logo-header.png\" alt=\"\">\r\n" + //
                "        <h1>Diseño E Implementacion del Software</h1>\r\n" + //
                "        <h2>Nombre: José Eduardo García Chávez</h2>\r\n" + //
                "        <h2>IDE: 07243032</h2>\r\n" + //
                "    </div>\r\n" + //
                "</body>\r\n" + //
                "</html>";
        return html;
    }
    
}
