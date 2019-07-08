package mojapaczka.services;

import mojapaczka.entity.Kategoria;

import java.util.List;

public interface CategoryService {
    List<Kategoria> getCategories();
    Kategoria getCategory(int categoryid);
    public void deleteCategory(int categoryid);
    public void saveCategory(Kategoria kategoria);
}
