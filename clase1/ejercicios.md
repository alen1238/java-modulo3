# Ejercicios

## Ejercicio 1 - Sistema de Gestión de Inventario
Desarrolla un sistema de gestión de inventario que permita a los usuarios agregar, eliminar, buscar y actualizar productos en un inventario. 

### Requisitos:
1. Crea una excepción personalizada llamada `ProductoNoEncontradoException` que extienda `RuntimeException`. Esta excepción debe ser lanzada cuando se intente buscar o eliminar un producto que no exista en el inventario.
1. Crea una excepción personalizada llamada `CantidadInvalidaException` que extienda `Exception`. Esta excepción debe ser lanzada cuando se intente actualizar la cantidad de un producto a un valor negativo.
1. Crea una clase llamada `Inventario` que contenga métodos para agregar, eliminar, buscar y actualizar productos.
    - Método `agregarProducto(String nombre, int cantidad)` que agregue un producto al inventario.
    - Método `eliminarProducto(String nombre)` que lance `ProductoNoEncontradoException` si el producto no existe.
    - Método `buscarProducto(String nombre)` que lance `ProductoNoEncontradoException` si el producto no existe y devuelva la cantidad disponible. 
    - Método `actualizarCantidad(String nombre, int nuevaCantidad)` que lance `ProductoNoEncontradoException` en caso de no encontrar el producto y `CantidadInvalidaException` si la cantidad es negativa.
1. Utiliza bloques `try-catch` para manejar las excepciones lanzadas por los métodos del `Inventario`. Proporciona mensajes de error adecuados para el usuario.
1. Crea una clase principal que permita al usuario interactuar con el inventario y maneje las excepciones adecuadamente.

## Ejercicio 2 - Sistema de Gestión de Reservas de Hotel
Desarrolla un sistema de gestión de reservas de hotel que permita a los usuarios registrar clientes, crear reservas y buscar reservas.

### Requisitos:
1. Crea una excepción personalizada _unchecked_ llamada `ClienteNoEncontradoException`. Esta excepción debe ser lanzada cuando se intente buscar un cliente que no exista en el sistema.
1. Clase  (Checked): Crea una excepción personalizada _checked_ llamada `ReservaInvalidaException`. Esta excepción debe ser lanzada cuando se intente crear una reserva con información inválida (por ejemplo, fechas incorrectas o cliente inexistente).
1. Crea una clase llamada `GestionClientes` que contenga métodos para registrar y buscar clientes.
    - Método `registrarCliente(String id, String nombre)` que registre un cliente en el sistema.
    - Método `buscarCliente(String id)` que lance `ClienteNoEncontradoException` si el cliente no existe.
1. Crea una clase llamada `GestionReservas` que contenga métodos para crear y buscar reservas.
    - Método `crearReserva(String clienteId, String fechaInicio, String fechaFin)` que lance `ReservaInvalidaException` si la información de la reserva es inválida.
    - Método `buscarReserva(String clienteId, String fechaInicio)` que lance `ClienteNoEncontradoException` si el cliente no existe.
1. Utiliza bloques `try-catch` para manejar las excepciones lanzadas por los métodos del `GestionClientes` y `GestionReservas`. Proporciona mensajes de error adecuados para el usuario.
1. Crea una clase principal que permita al usuario interactuar con el sistema de gestión de clientes y reservas, y maneje las excepciones adecuadamente.