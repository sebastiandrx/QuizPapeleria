package com.example.QuizPapeleria.Service;

import com.example.QuizPapeleria.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Object[]> obtenerVentasPorEmpleado(Long idEmpleado) {
        return ventaRepository.findVentasByEmpleado(idEmpleado);
    }

    public List<Object[]> obtenerVentasPorEmpleadoYFecha(Long idEmpleado, LocalDate fecha) {
        return ventaRepository.findVentasByEmpleadoAndFecha(idEmpleado, fecha);
    }


}
