package ijara.dev.ramito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Url {
    @Id
    @GeneratedValue
    private Long url_id;
    @ManyToOne
    Tienda tienda;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public void setId(Long url_id) {
        this.url_id = url_id;
    }

    public Long getId() {
        return url_id;
    }
}
