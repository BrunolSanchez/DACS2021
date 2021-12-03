package br.univille.brunodacs2021.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.univille.brunodacs2021.model.Fornecedor;
import br.univille.brunodacs2021.model.Produto;

@Service
public interface ProdutoService{
    public List<Produto> getAllProdutos();
    public Produto save(Produto produto);
    public void delete(Produto produto);
    public List<Produto> importProduto(Fornecedor fornecedor);
}
