package mojapaczka.dao;

import mojapaczka.entity.Kategoria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Kategoria> getCategories() {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery( " from Kategoria", Kategoria.class);
        List<Kategoria> categories = query.getResultList();

        return  categories;
    }

    @Override
    public Kategoria getCategory(int categoryid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery(" from Kategoria WHERE ID = " + categoryid, Kategoria.class);
        Kategoria k = query.getSingleResult();
        return k;
    }

    @Override
    public void deleteCategory(int categoryid) {
        Session session = sessionFactory.getCurrentSession();
        Query<Kategoria> query = session.createQuery(" from Kategoria WHERE ID = " + categoryid, Kategoria.class);
        Kategoria k = query.getSingleResult();
        session.delete(k);

    }


    @Override
    public void saveCategory(Kategoria kategoria) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(kategoria);
    }
}
