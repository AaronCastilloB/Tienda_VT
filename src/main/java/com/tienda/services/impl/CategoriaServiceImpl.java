package com.tienda.services.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Producto;
import com.tienda.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            //Se eliminan los inactivos...
            lista.removeIf(c -> !c.isActivo());

        }

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getCategoria(Producto categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Producto categoria) {
        categoriaDao.delete(categoria);
    }
}
