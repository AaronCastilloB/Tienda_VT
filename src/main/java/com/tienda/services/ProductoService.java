package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Se obtiene un List de objetos producto que son los registros de la tabla producto.
    //Pueden ser todos o solo los activos....
    public List<Producto> getProductos(boolean activos);

// Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

    //Consulta ampliada Método que recupera los productos que estan en un rango de precios.
    public List<Producto> consultaAmpliada(double precioInf, double precioSup);

    //Consulta JPQL Método que recupera los productos que estan en un rango de precios.
    public List<Producto> consultaJPQL(double precioInf, double precioSup);

    //Consulta SQL Nativa Método que recupera los productos que estan en un rango de precios.
    public List<Producto> consultaSQL(double precioInf, double precioSup);
}
