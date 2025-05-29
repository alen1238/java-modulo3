import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> productos = new HashMap<>();


    public void agregarProducto(Producto producto){
        productos.put(producto.getNombre(), producto);
    }

    public void procesarPedido(String nombreProducto, int cantidad) throws ProductoNoEncontradoException{
        Producto producto = productos.get(nombreProducto);

        if(producto == null){
            throw new ProductoNoEncontradoException("El producto " + nombreProducto + " no existe");
        }
        producto.reducirStock(cantidad);
    }
}
