package ijara.dev.ramito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Precio {
    @Id
    @GeneratedValue
    private Long id;
    private long precio_base;
    private long precio_especial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(long precio_base) {
        this.precio_base = precio_base;
    }

    public long getPrecio_especial() {
        return precio_especial;
    }

    public void setPrecio_especial(long precio_especial) {
        this.precio_especial = precio_especial;
    }
}
