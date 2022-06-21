package ijara.dev.ramito;


import ijara.dev.ramito.model.Producto;
import ijara.dev.ramito.repo.RepoProducto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RamitoApplication {
    private static final Logger log = LoggerFactory.getLogger(RamitoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RamitoApplication.class, args);
    }
    /*@Bean
    public CommandLineRunner demo(RepoProducto repo){
        return(args) ->{
            Producto prod = new Producto();
            prod.setNombre("test");
            repo.save(prod);
            log.info("obtener todos los productos");
            for (Producto productos : repo.findAll()){
                log.info(productos.toString());
            }
            log.info("");
        };
    }
*/
}
