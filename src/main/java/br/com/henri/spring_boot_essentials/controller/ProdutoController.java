package br.com.henri.spring_boot_essentials.controller;

import br.com.henri.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.henri.spring_boot_essentials.dto.ProdutoDto;
import br.com.henri.spring_boot_essentials.exception.NotFoundExecption;
import br.com.henri.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {
//    @Autowired //primeira forma de chamar o service
    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto){
        return produtoService.createProduct(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity updateProduct(@PathVariable Integer id, @RequestBody ProdutoDto produtoDto) throws NotFoundExecption {
        return ProdutoService.atualizarProduto(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delteProduct(@PathVariable Integer id) {
        ProdutoService.delectProduct(id);
    }

}
