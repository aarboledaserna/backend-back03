package org.mintic.back03.interfaces;

import java.util.List;

public interface Operaciones<T> {

    public List<T> Consultar();

    public boolean Agregar(T miObjeto);

    public Integer CantidadRegistros();

    public boolean Eliminar(Integer llavePrimaria);

    public T buscar(Integer llavePrimaria);
}
