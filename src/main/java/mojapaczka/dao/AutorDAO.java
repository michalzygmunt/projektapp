package mojapaczka.dao;

import mojapaczka.entity.Autor;

import java.util.List;

public interface AutorDAO {
    public List<Autor> getAutors();
    public Autor getAutor(int autorid);
    public void deleteAutor(int autorid);
    public void saveAutor(Autor autor);

}
