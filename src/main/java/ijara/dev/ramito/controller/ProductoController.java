package ijara.dev.ramito.controller;

import ijara.dev.ramito.model.Producto;
import ijara.dev.ramito.repo.RepoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductoController {
    @Autowired
    RepoProducto repoProducto;
    @GetMapping("/productos")
    public String listadoProductos( Model model ) {
        model.addAttribute("listadoProductos", repoProducto.findAll());
        return "productos";
    }
}
