package com.example.QuizPapeleria.Controller;


import com.example.QuizPapeleria.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/por-proveedor/{id}")
    public List<Object[]> productosPorProveedor(@PathVariable Long id) {
        return productoService.obtenerProductosPorProveedor(id);
    }

}
