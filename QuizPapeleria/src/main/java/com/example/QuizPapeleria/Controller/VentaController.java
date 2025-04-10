package com.example.QuizPapeleria.Controller;

import com.example.QuizPapeleria.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("/por-empleado/{id}")
    public List<Object[]> ventasPorEmpleado(@PathVariable Long id) {
        return ventaService.obtenerVentasPorEmpleado(id);
    }

    @GetMapping("/por-empleado-y-fecha")
    public List<Object[]> ventasPorEmpleadoYFecha(@RequestParam Long id, @RequestParam String fecha) {
        LocalDate parsedDate = LocalDate.parse(fecha);
        return ventaService.obtenerVentasPorEmpleadoYFecha(id, parsedDate);
    }


}
