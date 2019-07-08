package mojapaczka.services;

import mojapaczka.dao.AutorDAO;
import mojapaczka.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    AutorDAO autorDAO;

    @Override
    @Transactional
    public List<Autor> getAutors() {
        List<Autor> autors = autorDAO.getAutors();

        return autors;
    }
    @Override
    @Transactional
    public Autor getAutor(int autorid) {
        return autorDAO.getAutor(autorid);
    }

    @Override
    @Transactional
    public void deleteAutor(int autorid) {
        autorDAO.deleteAutor(autorid);
    }

    @Override
    @Transactional
    public void saveAutor(Autor autor) {
        autorDAO.saveAutor(autor);
    }
}
