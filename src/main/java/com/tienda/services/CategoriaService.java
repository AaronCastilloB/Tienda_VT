package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se obtiene un List de objetos categoria que son los registros de la tabla categoria.
    //Pueden ser todos o solo los activos....
    
    public List<Categoria> getCategorias(boolean activos);
}
