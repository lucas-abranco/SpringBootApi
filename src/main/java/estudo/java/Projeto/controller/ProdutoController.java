package estudo.java.Projeto.controller;

import estudo.java.Projeto.Model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido:" + produto);
     return produto;
    }

}
