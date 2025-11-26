package br.senac.tads.dsw.produtoSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.tads.dsw.produtoSpring.persistence.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProtudoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listar(){
        return repository.findAll();
    }

}
