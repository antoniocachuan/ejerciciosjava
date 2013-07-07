package jsf.beans;

import entity.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VentaBean {

    private List<Venta> ventas;
    private Venta venta;
    private Venta ventaActual;
    private String titulo;
    private int estado; //1->editar, 2->eliminar

    public VentaBean() {
    }
    //no se usa el constructor

    @PostConstruct
    public void init() {
        ventas = new ArrayList<Venta>();
        venta = new Venta();
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public Venta getVentaActual() {
        return ventaActual;
    }

    public void setVentaActual(Venta ventaActual) {
        this.ventaActual = ventaActual;
    }

    public void setEditar(Venta ventaActual) {
        titulo = "Editar Venta";
        estado = 1;
        this.ventaActual = ventaActual;
    }

    public void setEliminar(Venta ventaActual) {
        titulo = "Eliminar Venta";
        estado = 2;
        this.ventaActual = ventaActual;
    }

    public String grabar() {
        venta.setTotal(venta.getCant() * venta.getPrecio());
        ventas.add(venta);
        venta = new Venta();
        return "listadoVentas";
    }

    public void procesar() {
        ventas.remove(ventaActual);
        ventaActual = null;
    }
}
