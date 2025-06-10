public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido("Alfonso Lara");

        pedido.agregarProducto(new Producto("Teclado mecánico", 150.0));
        pedido.agregarProducto(new Producto("Mouse gamer", 80.0));
        pedido.agregarProducto(new Producto("monitor led", 200.0));

        double total = pedido.calcularTotal();
        System.out.println("El total el pedido de " + pedido.getCliente() + " $" + total);
    }
}
