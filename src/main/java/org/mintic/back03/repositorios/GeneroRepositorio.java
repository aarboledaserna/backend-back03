package org.mintic.back03.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.mintic.back03.entidades.Genero;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Integer> {

    @Query("SELECT gen FROM Genero gen")
    public List<Genero> obtenerTodas();

}
