package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface ProductoDao extends JpaRepository<Producto, Long> {

    //Consulta ampliada Método que recupera los productos que estan en un rango de precios.
    public List<Producto> findByPrecioBetweenOrderByPrecioAsc(double precioInf, double precioSup);

    //Consulta JPQL Método que recupera los productos que estan en un rango de precios.
    @Query(value = "SELECT a "
            + "FROM Producto a "
            + "WHERE a.precio "
            + "BETWEEN :precioInf AND :precioSup "
            + "ORDER BY a.precio ASC")
    public List<Producto> consultaJPQL(
            @Param("precioInf") double precioInf,
            @Param("precioSup") double precioSup);

    //Consulta SQL Nativa Método que recupera los productos que estan en un rango de precios.
    @Query(nativeQuery = true,
            value = "SELECT * "
            + "FROM producto a "
            + "WHERE a.precio "
            + "BETWEEN :precioInf AND :precioSup "
            + "ORDER BY a.precio ASC")
    public List<Producto> consultaSQL(
            @Param("precioInf") double precioInf,
            @Param("precioSup") double precioSup);
}
