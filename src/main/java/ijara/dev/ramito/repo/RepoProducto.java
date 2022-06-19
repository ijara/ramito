package ijara.dev.ramito.repo;

import ijara.dev.ramito.model.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoProducto  extends CrudRepository<Producto,Long> {

}
