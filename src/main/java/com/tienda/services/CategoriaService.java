package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface CategoriaService {

    //Se obtiene un List de objetos categoria que son los registros de la tabla categoria.
    //Pueden ser todos o solo los activos....
    public List<Producto> getCategorias(boolean activos);

// Se obtiene un Categoria, a partir del id de un categoria
    public Producto getCategoria(Producto categoria);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto categoria);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto categoria);
}
