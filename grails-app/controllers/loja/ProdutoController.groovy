package loja

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProdutoController {


    def adicionarCarrinho(Long id){
        def carrinho = Carrinho.findByUsuario(session.usuario)
        def produto = Produto.findById(id)
        if(produto?.estoque) {
            carrinho.addToProdutos(produto)
            --produto.estoque
            carrinho.save(flush: true, failOnError: true)
            redirect controller: "menu"
        }
        else{
            redirect controller: "menu",action:"contatar"
        }

    }
}
