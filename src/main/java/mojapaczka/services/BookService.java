package mojapaczka.services;

import mojapaczka.entity.Autor;
import mojapaczka.entity.Kategoria;
import mojapaczka.entity.Ksiazka;

import java.util.List;

public interface BookService {
    List<Ksiazka> getBooks();
    List<Kategoria> getCategories();
    List<Autor> getAutors();
    Ksiazka getBook(int bookid);
    Kategoria getCategory(int categoryid);
    Autor getAutor(int autorid);
    public void saveBook(Ksiazka ksiazka);
    public void deleteBook(int bookid);
//    public void deleteCategory(int categoryid);
//    public void deleteAutor(int autorid);
//    public void saveCategory(Kategoria kategoria);
//    public void saveAutor(Autor autor);

}
