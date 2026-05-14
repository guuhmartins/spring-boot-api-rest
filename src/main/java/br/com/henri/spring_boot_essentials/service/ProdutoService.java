package br.com.henri.spring_boot_essentials.service;

import br.com.henri.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.henri.spring_boot_essentials.dto.ProdutoDto;
import br.com.henri.spring_boot_essentials.exception.NotFoundExecption;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static {
        PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .nome("notebook")
                .preco(new BigDecimal(5000))
                .quantidade(10)
                .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(2)
                        .nome("Iphone")
                        .preco(new BigDecimal(7000))
                        .quantidade(10)
                        .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(3)
                        .nome("mouse")
                        .preco(new BigDecimal(500))
                        .quantidade(10)
                        .build());
    }


    public List<ProdutoEntity> findAll() {   //buscar e listar todos os produtos do meu database
        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduct(ProdutoDto produtoDto) {

        Integer indentificador = PRODUTOS.stream()
                .mapToInt(ProdutoEntity::getId)
                .max()
                .orElse(0) + 1;

        ProdutoEntity novoProduto = ProdutoEntity.builder()
                .id(indentificador)
                .nome(produtoDto.getNome())
                .preco(produtoDto.getPreco())
                .quantidade(produtoDto.getQuantidade())
                .build();

        PRODUTOS.add(novoProduto);

        return novoProduto;
    }

    public static ProdutoEntity atualizarProduto(ProdutoDto produtoDto, Integer id) throws NotFoundExecption {

          ProdutoEntity produto =  PRODUTOS.stream()
                                    .filter(p -> p.getId().equals(id) )
                                    .findAny()
                                    .orElseThrow(() -> new NotFoundExecption("Produto Nao encontrado"));
          produto.setNome(produtoDto.getNome());
          produto.setPreco(produtoDto.getPreco());
          produto.setQuantidade(produtoDto.getQuantidade());

        return produto;
    }

    public static void delectProduct(Integer id){
        PRODUTOS.removeIf(p -> p.getId().equals(id));
    }
}
