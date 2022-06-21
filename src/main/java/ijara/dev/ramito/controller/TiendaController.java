package ijara.dev.ramito.controller;

import ijara.dev.ramito.repo.RepoTienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TiendaController {
    @Autowired
    RepoTienda repoTienda;

    @GetMapping("/tiendas/all")
    public String listadoTiendas(Model model){
        model.addAttribute("listadoTiendas",repoTienda.findAll());
        return "tiendas/all";
    }

}
