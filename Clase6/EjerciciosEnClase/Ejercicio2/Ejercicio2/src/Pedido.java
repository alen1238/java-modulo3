import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    //******Atributos******!!
    private String cliente;
    private List<Producto> productos; //null
    //***************/

    public Pedido(String cliente){
        this.cliente = cliente;
        productos = new ArrayList<>();
    }

    public Pedido(){
        cliente = null;
    }

    public void cargarDatos(Pedido pedidoBD){
        cliente = pedidoBD.getCliente();
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }

    public String getCliente(){
        return cliente;
    }
}
