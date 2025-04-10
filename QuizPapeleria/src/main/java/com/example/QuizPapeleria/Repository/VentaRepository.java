package com.example.QuizPapeleria.Repository;

import com.example.QuizPapeleria.Models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository <Venta, Long> {

    // 1. Ventas realizadas por un empleado con sus respectivos clientes
    @Query(value = """
        SELECT v.id_venta, v.fecha, c.nombre AS cliente, e.nombre AS empleado
        FROM venta v
        JOIN cliente c ON v.id_cliente = c.id_cliente
        JOIN empleado e ON v.id_empleado = e.id_empleado
        WHERE e.id_empleado = :empleadoId
    """, nativeQuery = true)
    List<Object[]> findVentasByEmpleado(@Param("empleadoId") Long empleadoId);


    // 4. Ventas de un empleado por fecha
    @Query(value = """
        SELECT v.id_venta, v.fecha, c.nombre AS cliente
        FROM venta v
        JOIN cliente c ON v.id_cliente = c.id_cliente
        WHERE v.id_empleado = :empleadoId AND v.fecha = :fecha
    """, nativeQuery = true)
    List<Object[]> findVentasByEmpleadoAndFecha(@Param("empleadoId") Long empleadoId, @Param("fecha") LocalDate fecha);



}
