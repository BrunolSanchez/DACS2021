package br.univille.brunodacs2021.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.brunodacs2021.model.Categoria;
import br.univille.brunodacs2021.repository.CategoriaRepository;
import br.univille.brunodacs2021.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<Categoria> getAllCategorias() {
        return repository.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        repository.delete(categoria);
    }
}
