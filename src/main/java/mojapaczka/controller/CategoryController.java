package mojapaczka.controller;

import mojapaczka.entity.Kategoria;
import mojapaczka.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
@RequestMapping("/books")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public String listCategories(Model model){
        List<Kategoria> categories= categoryService.getCategories();
        model.addAttribute("categories",categories);
        return "categorylist";
    }

    @GetMapping("/formcategoryadd")
    public String addFormCategory(Model model){
        Kategoria category = new Kategoria();
        model.addAttribute("category",category);
        return "addcategoryform";
    }

    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("category") Kategoria kategoria){
        categoryService.saveCategory(kategoria);
        return "redirect:/books/categories";
    }

    @GetMapping("/updateCategoryForm")
    public String updateCategoryForm(@RequestParam(value = "categoryId", required = true) int categoryid, Model model){
        Kategoria kategoria = categoryService.getCategory(categoryid);
        model.addAttribute("category", kategoria);
        return "updateCategoryForm";
    }

    @GetMapping("/deleteCategoryForm")
    public  String deleteCategoryForm(@RequestParam(value = "categoryId", required = true) int categoryid, Model model){
        Kategoria kategoria = categoryService.getCategory(categoryid);
        categoryService.deleteCategory(categoryid);
        model.addAttribute("category", kategoria);
        return "deleteCategoryForm";
    }

}
