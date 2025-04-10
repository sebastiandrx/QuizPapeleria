package com.example.QuizPapeleria.Service;

import com.example.QuizPapeleria.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Object[]> obtenerClientesConDetalleVenta() {
        return clienteRepository.findClientesConDetalleVenta();
    }

}
