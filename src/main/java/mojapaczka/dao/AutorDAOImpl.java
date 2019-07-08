package mojapaczka.dao;

import mojapaczka.entity.Autor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AutorDAOImpl implements AutorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Autor> getAutors() {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor",Autor.class);
        List<Autor> autors = query.getResultList();

        return autors;
    }

    @Override
    public Autor getAutor(int autorid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor WHERE ID = " + autorid, Autor.class);
        Autor a = query.getSingleResult();
        return a;
    }

    @Override
    public void deleteAutor(int autorid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Autor> query = session.createQuery(" from Autor WHERE ID = " + autorid, Autor.class);
        Autor a = query.getSingleResult();
        session.delete(a);
    }

    @Override
    public void saveAutor(Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(autor);
    }
}
