package com.example.QuizPapeleria.Repository;

import com.example.QuizPapeleria.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {

    // 2. Productos que ofrece un proveedor
    @Query(value = """
        SELECT p.id_producto, p.nombre, p.precio
        FROM producto p
        WHERE p.id_proveedor = :proveedorId
    """, nativeQuery = true)
    List<Object[]> findProductosByProveedor(@Param("proveedorId") Long proveedorId);


}
