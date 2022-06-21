package ijara.dev.ramito.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stock {
    private int stock;
    @ManyToMany
    private List<Tienda> tienda;
    @ManyToMany
    private List<Producto> producto;
    @ManyToMany
    private List<Precio> precio;
    @Id
    @GeneratedValue
    private Long stock_id;


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Tienda> getTienda() {
        return tienda;
    }

    public void setTienda(List<Tienda> tienda) {
        this.tienda = tienda;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public List<Precio> getPrecio() {
        return precio;
    }

    public void setPrecio(List<Precio> precio) {
        this.precio = precio;
    }

    public void setId(Long stock_id) {
        this.stock_id = stock_id;
    }

    public Long getId() {
        return stock_id;
    }
}
