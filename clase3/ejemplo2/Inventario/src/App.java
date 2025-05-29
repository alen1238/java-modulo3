public class App {
    public static void main(String[] args) {
        /**
         * Crearemos un sistema de gestión de pedidos se deben verificar si hay suficiente stock 
         * antes de procesar una orden. Si el producto no existe (checked) o si en stock es 
         * insuficiente (unchecked), 
         * debo lanzar excepciones
         * personalizadas que indiquen el problema.
         */

         Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("arroz", 100));
        inventario.agregarProducto(new Producto("aceite", 120));
        inventario.agregarProducto(new Producto("lenteja",90));
        inventario.agregarProducto(new Producto("dulce", 500));
        inventario.agregarProducto(new Producto("carne", 70));

        try {
            inventario.procesarPedido("arroz", 30);
            inventario.procesarPedido("arequipe", 20);
            inventario.procesarPedido("lenteja", 2000);

        } catch (ProductoNoEncontradoException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch(StockInsuficienteException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Programa finalizado");
    }
}
