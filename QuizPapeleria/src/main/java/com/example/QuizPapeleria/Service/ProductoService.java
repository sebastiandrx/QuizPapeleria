package com.example.QuizPapeleria.Service;

import com.example.QuizPapeleria.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Object[]> obtenerProductosPorProveedor(Long proveedorId) {
        return productoRepository.findProductosByProveedor(proveedorId);
    }

}
