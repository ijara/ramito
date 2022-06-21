package ijara.dev.ramito.model;

import org.springframework.ui.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public  class Tienda  {
    @Id
    @GeneratedValue
    private Long tienda_id;
    private int nombre;
    @OneToMany
    private List<Url> urls;
    @OneToMany
    List<Producto> productos;

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setId(Long tienda_id) {
        this.tienda_id = tienda_id;
    }

    public Long getId() {
        return tienda_id;
    }
}
