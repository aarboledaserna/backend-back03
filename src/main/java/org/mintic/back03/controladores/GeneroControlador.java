package org.mintic.back03.controladores;

import java.util.List;
import org.mintic.back03.entidades.Genero;
import org.mintic.back03.servicios.GeneroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generos")
@CrossOrigin(origins = "*")
public class GeneroControlador {

    @Autowired
    private GeneroServicio geneServi;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public List<Genero> obtenerTodasCategorias(){
    return geneServi.Consultar();
    }
}
