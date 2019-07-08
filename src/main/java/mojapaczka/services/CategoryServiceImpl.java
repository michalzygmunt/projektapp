package mojapaczka.services;

import mojapaczka.dao.CategoryDAO;
import mojapaczka.entity.Kategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    @Transactional
    public List<Kategoria> getCategories() {
        List<Kategoria> categories = categoryDAO.getCategories();

        return  categories;
    }

    @Override
    @Transactional
    public Kategoria getCategory(int categoryid) {
        return categoryDAO.getCategory(categoryid);
    }

    @Override
    @Transactional
    public void deleteCategory(int categoryid) {
        categoryDAO.deleteCategory(categoryid);
    }

    @Override
    @Transactional
    public void saveCategory(Kategoria kategoria) {
        categoryDAO.saveCategory(kategoria);
    }
}
