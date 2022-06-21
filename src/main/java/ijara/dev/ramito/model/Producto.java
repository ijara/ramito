package ijara.dev.ramito.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long producto_id;
    private String sku;
    private String nombre;
    @ManyToMany
    private List<Tag> tags;
    @ManyToMany
    private List<Tienda> tiendas;

    public Long getId() {
        return producto_id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(List<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    public void setId(Long producto_id) {
        this.producto_id = producto_id;
    }
}
