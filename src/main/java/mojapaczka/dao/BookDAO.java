package mojapaczka.dao;

import mojapaczka.entity.Autor;
import mojapaczka.entity.Kategoria;
import mojapaczka.entity.Ksiazka;


import java.util.List;

public interface BookDAO {
    public List<Ksiazka> getBooks();
    public List<Kategoria> getCategories();
    public List<Autor> getAutors();
    public void saveBook(Ksiazka ksiazka);
    public Ksiazka getBook(int bookid);
    public Kategoria getCategory(int categoryid);
    public Autor getAutor(int autorid);
    public void deleteBook(int bookid);
//    public void deleteCategory(int categoryid);
    public void deleteAutor(int autorid);
//    public void saveCategory(Kategoria kategoria);
    public void saveAutor(Autor autor);



}
