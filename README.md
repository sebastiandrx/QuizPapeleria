# QuizPapeleria

1. Cuales son las ventas que ha realizado un empleado con sus respectivos clientes

GET http://localhost:8080/api/ventas/por-empleado/1 = VentaController

2. Cuales son los productos que ofrece un proveedor

GET http://localhost:8080/api/productos/por-proveedor/2 = ProductoController

3. Clientes con el detalle de venta

GET http://localhost:8080/api/clientes/detalle-venta = ClienteController

4. Las ventas de un empleado por fecha

GET http://localhost:8080/api/ventas/por-empleado-y-fecha?id=1&fecha=2025-04-10 = VentaController

