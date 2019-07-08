package mojapaczka.dao;

import mojapaczka.entity.Autor;
import mojapaczka.entity.Kategoria;
import mojapaczka.entity.Ksiazka;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Ksiazka> getBooks() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Ksiazka> query = currentSession.createQuery(" from Ksiazka", Ksiazka.class);
        List<Ksiazka> books = query.getResultList();

        return books;
    }

    @Override
    public List<Kategoria> getCategories() {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery( " from Kategoria", Kategoria.class);
        List<Kategoria> categories = query.getResultList();

        return  categories;
    }

    @Override
    public List<Autor> getAutors() {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor",Autor.class);
        List<Autor> autors = query.getResultList();

        return autors;
    }

    @Override
    public void saveBook(Ksiazka ksiazka) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(ksiazka);
    }

    @Override
    public Ksiazka getBook(int bookid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Ksiazka> query = session.createQuery(" from Ksiazka WHERE ID = " + bookid, Ksiazka.class);
        Ksiazka k = query.getSingleResult();
        return k;
    }

    @Override
    public Kategoria getCategory(int categoryid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery(" from Kategoria WHERE ID = " + categoryid, Kategoria.class);
        Kategoria k = query.getSingleResult();
        return k;
    }

    @Override
    public Autor getAutor(int autorid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor WHERE ID = " + autorid, Autor.class);
        Autor a = query.getSingleResult();
        return a;
    }

    @Override
    public void deleteBook(int bookid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Ksiazka> query = session.createQuery(" from Ksiazka WHERE ID = " + bookid, Ksiazka.class);
        Ksiazka k = query.getSingleResult();
        session.delete(k);
    }

  /*  @Override
    public void deleteCategory(int categoryid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery(" from Kategoria WHERE ID = " + categoryid, Kategoria.class);
        Kategoria k = query.getSingleResult();
        session.delete(k);

    }*/

    @Override
    public void deleteAutor(int autorid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor WHERE ID = " + autorid, Autor.class);
        Autor a = query.getSingleResult();
        session.delete(a);
    }

   /* @Override
    public void saveCategory(Kategoria kategoria) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(kategoria);
    }
*/
    @Override
    public void saveAutor(Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(autor);
    }


}
