package org.mintic.back03.servicios;

import java.util.List;
import org.mintic.back03.entidades.Genero;
import org.mintic.back03.interfaces.Operaciones;
import org.mintic.back03.repositorios.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Generoservice")

public class GeneroServicio implements Operaciones<Genero>{

    @Autowired
    private GeneroRepositorio geneRepo;
    
    @Override
    public List<Genero> Consultar() {
      return geneRepo.obtenerTodas();
        
    }

    @Override
    public boolean Agregar(Genero miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer CantidadRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Genero buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
