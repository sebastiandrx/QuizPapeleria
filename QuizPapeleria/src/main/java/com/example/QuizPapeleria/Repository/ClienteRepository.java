package com.example.QuizPapeleria.Repository;

import com.example.QuizPapeleria.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {

    // 3. Clientes con su detalle de venta
    @Query(value = """
        SELECT c.nombre AS cliente, dv.id_detalle, dv.cantidad, dv.precio_unitario
        FROM cliente c
        JOIN venta v ON c.id_cliente = v.id_cliente
        JOIN detalle_venta dv ON dv.id_venta = v.id_venta
    """, nativeQuery = true)
    List<Object[]> findClientesConDetalleVenta();
}
