package br.univille.brunodacs2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.brunodacs2021.model.Fornecedor;
import br.univille.brunodacs2021.service.FornecedorService;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {
    
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ModelAndView index(){

        List<Fornecedor> listaFornecedores = service.getAllFornecedores();

        return new ModelAndView("fornecedor/index", "listafornecedores", listaFornecedores);

    }
    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Fornecedor fornecedor){


      return new ModelAndView("fornecedor/form");
    }
    @PostMapping(params = "form")
    public ModelAndView save(Fornecedor fornecedor){
        service.save(fornecedor);
        return new ModelAndView("redirect:/fornecedor");

    }

}
