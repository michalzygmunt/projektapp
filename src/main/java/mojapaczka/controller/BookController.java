package mojapaczka.controller;

import mojapaczka.entity.Autor;
import mojapaczka.entity.Kategoria;
import mojapaczka.entity.Ksiazka;
import mojapaczka.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public String listBook(Model model){
        List<Ksiazka> books = bookService.getBooks();
       model.addAttribute("books",books);
       return "booklist";
    }

    /*@GetMapping("/categories")
    public String listCategories(Model model){
        List<Kategoria> categories= bookService.getCategories();
        model.addAttribute("categories",categories);
        return "categorylist";
    }*/

    /*@GetMapping("/autors")
    public String listAutors(Model model){
        List<Autor> autors = bookService.getAutors();
        model.addAttribute("autors",autors);
        return "autorlist";
    }*/
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/formadd")
    public String addForm(Model model){
        Ksiazka book = new Ksiazka();
        List<Kategoria> kategorie = bookService.getCategories();
        model.addAttribute("category", kategorie);
        model.addAttribute("book",book);
        return "addbookform";
    }

    /*@GetMapping("/formcategoryadd")
    public String addFormCategory(Model model){
        Kategoria category = new Kategoria();
        model.addAttribute("category",category);
        return "addcategoryform";
    }*/

   /* @GetMapping("formautoradd")
    public String addFormAutor(Model model){
        Autor autor = new Autor();
        model.addAttribute("autor",autor);
        return "addautorform";
    }*/
   @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Ksiazka ksiazka){

        bookService.saveBook(ksiazka);
        return "redirect:/books/list";
    }

    /*@PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("category") Kategoria kategoria){
        bookService.saveCategory(kategoria);
        return "redirect:/books/categories";
    }*/

    /*@PostMapping("/saveAutor")
    public String saveAutor(@ModelAttribute("autor") Autor autor){
        bookService.saveAutor(autor);
        return "redirect:/books/autors";
    }*/



   /* @PostMapping("/deleteBook")
    public String deleteBook(@ModelAttribute("book") Ksiazka ksiazka){

        bookService.deleteBook(ksiazka.getId());
        System.out.println(ksiazka.getId() + " ID KSIONZKI");
        return "redirect:/books/list";
    }*/

  /* @GetMapping("/updateCategoryForm")
   public String updateCategoryForm(@RequestParam(value = "categoryId", required = true) int categoryid, Model model){
       Kategoria kategoria = bookService.getCategory(categoryid);
       model.addAttribute("category", kategoria);
       return "updateCategoryForm";
   }*/


    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/updateBookForm")
    public String updateBookForm(@RequestParam(value = "bookId", required = true) int bookid, Model model){
        Ksiazka ksiazka = bookService.getBook(bookid);
        List<Kategoria> kategorie = bookService.getCategories();
        model.addAttribute("category",kategorie);
        model.addAttribute("book",ksiazka);
        return "updateBookForm";
    }

    /*@GetMapping("/updateAutorForm")
    public String updateAutorForm(@RequestParam(value = "autorId", required = true) int autorid, Model model){
       Autor autor = bookService.getAutor(autorid);
       model.addAttribute("autor",autor);
       return "updateAutorForm";
    }*/

    /*@GetMapping("/formdelete")
    public String deleteForm(Model model){
        Ksiazka book = new Ksiazka();
        model.addAttribute("book",book);
        return "deletebookform";
    }*/

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/deleteBookFormularz")
    public String deleteBookForm(@RequestParam(value = "bookId", required = true) int bookid, Model model){
        Ksiazka ksiazka = bookService.getBook(bookid);
        bookService.deleteBook(bookid);
        model.addAttribute("book",ksiazka);
        return "deleteBookFormularz";
     //   return "redirect:/books/list";
    }

    /*@GetMapping("/deleteCategoryForm")
    public  String deleteCategoryForm(@RequestParam(value = "categoryId", required = true) int categoryid, Model model){
        Kategoria kategoria = bookService.getCategory(categoryid);
        bookService.deleteCategory(categoryid);
        model.addAttribute("category", kategoria);
        return "deleteCategoryForm";
    }*/

    /*@GetMapping("/deleteAutorForm")
    public String deleteAutorForm(@RequestParam(value = "autorId", required = true) int autorid, Model model){
        Autor autor = bookService.getAutor(autorid);
        bookService.deleteAutor(autorid);
        model.addAttribute("autor", autor);
        return "deleteAutorForm";
    }*/


}
