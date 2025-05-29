public class Producto {
    String nombre;
    int cantidad;
    
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void reducirStock(int cantidadPedida) throws StockInsuficienteException{
        if(cantidadPedida > cantidad){
            throw new StockInsuficienteException("No hay suficiente stock");
        }
        cantidad -= cantidadPedida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    
}
