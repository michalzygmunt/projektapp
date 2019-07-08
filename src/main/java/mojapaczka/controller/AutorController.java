package mojapaczka.controller;

import mojapaczka.entity.Autor;
import mojapaczka.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autors")
    public String listAutors(Model model){
        List<Autor> autors = autorService.getAutors();
        model.addAttribute("autors",autors);
        return "autorlist";
    }

    @GetMapping("formautoradd")
    public String addFormAutor(Model model){
        Autor autor = new Autor();
        model.addAttribute("autor",autor);
        return "addautorform";
    }

    @PostMapping("/saveAutor")
    public String saveAutor(@ModelAttribute("autor") Autor autor){
        autorService.saveAutor(autor);
        return "redirect:/books/autors";
    }

    @GetMapping("/updateAutorForm")
    public String updateAutorForm(@RequestParam(value = "autorId", required = true) int autorid, Model model){
        Autor autor = autorService.getAutor(autorid);
        model.addAttribute("autor",autor);
        return "updateAutorForm";
    }

    @GetMapping("/deleteAutorForm")
    public String deleteAutorForm(@RequestParam(value = "autorId", required = true) int autorid, Model model){
        Autor autor = autorService.getAutor(autorid);
        autorService.deleteAutor(autorid);
        model.addAttribute("autor", autor);
        return "deleteAutorForm";
    }
}
