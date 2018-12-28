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
    def salvar(){
        def produto = new Produto(params)
        //Foto
        def a = request.getFile("arquivo")
        def nomeOriginal = params.arquivo.originalFilename
        def tamanho = nomeOriginal.length()
        def extensao = nomeOriginal.substring(tamanho - 3, tamanho)
        //Fim foto
        produto.foto = "${((Produto.list()).size())+1}.${extensao}"
        produto.categoria = Categoria.findByNome(params.categoria.nome)
        a.transferTo(new File("C:/development/Projetos/loja/grails-app/assets/images/img/Produtos/${produto.foto}"))
        produto.save(flush:true, failOnError:true)
        redirect controller: "menu"
    }
}
