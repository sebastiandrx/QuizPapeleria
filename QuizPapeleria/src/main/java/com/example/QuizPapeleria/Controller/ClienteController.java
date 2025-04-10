package com.example.QuizPapeleria.Controller;

import com.example.QuizPapeleria.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/detalle-venta")
    public List<Object[]> detalleVentaClientes() {
        return clienteService.obtenerClientesConDetalleVenta();
    }

}
