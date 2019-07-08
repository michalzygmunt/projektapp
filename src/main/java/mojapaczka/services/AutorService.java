package mojapaczka.services;

import mojapaczka.entity.Autor;

import java.util.List;

public  interface AutorService {
    List<Autor> getAutors();
    Autor getAutor(int autorid);
    public void deleteAutor(int autorid);
    public void saveAutor(Autor autor);
}
