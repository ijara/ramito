package ijara.dev.ramito.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {

    private String tag;
    @Id
    @GeneratedValue
    private Long tag_id;


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setId(Long tag_id) {
        this.tag_id = tag_id;
    }

    public Long getId() {
        return tag_id;
    }
}
