package entity;

public class Venta {
    private String cliente;
    private String producto;
    private double precio;
    private int cant;
    private double total;
    
    public Venta(){
    }

    public Venta(String cliente, String producto, double precio, int cant, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
        this.cant = cant;
        this.total = total;
    }
 
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
