package mojapaczka.services;

import mojapaczka.dao.BookDAO;
import mojapaczka.entity.Autor;
import mojapaczka.entity.Kategoria;
import mojapaczka.entity.Ksiazka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Ksiazka> getBooks() {
        List<Ksiazka> books = bookDAO.getBooks();

        return  books;
    }

    @Override
    @Transactional
    public List<Kategoria> getCategories() {
        List<Kategoria> categories = bookDAO.getCategories();

        return  categories;
    }

    @Override
    @Transactional
    public List<Autor> getAutors() {
        List<Autor> autors = bookDAO.getAutors();

        return autors;
    }

    @Override
    @Transactional
    public Ksiazka getBook(int bookid) {
        return bookDAO.getBook(bookid);
    }

    @Override
    @Transactional
    public Kategoria getCategory(int categoryid) {
        return bookDAO.getCategory(categoryid);
    }

    @Override
    @Transactional
    public Autor getAutor(int autorid) {
        return bookDAO.getAutor(autorid);
    }

    @Override
    @Transactional
    public void saveBook(Ksiazka ksiazka) {
        bookDAO.saveBook(ksiazka);
    }

    @Override
    @Transactional
    public void deleteBook(int bookid) {
        bookDAO.deleteBook(bookid);
    }

   /* @Override
    @Transactional
    public void deleteCategory(int categoryid) {
        bookDAO.deleteCategory(categoryid);
    }*/

   /* @Override
    @Transactional
    public void deleteAutor(int autorid) {
    bookDAO.deleteAutor(autorid);
    }*/

   /* @Override
    @Transactional
    public void saveCategory(Kategoria kategoria) {
        bookDAO.saveCategory(kategoria);
    }*/

    /*@Override
    @Transactional
    public void saveAutor(Autor autor) {
    bookDAO.saveAutor(autor);
    }*/


}
