package loja

import grails.validation.ValidationException

import java.text.SimpleDateFormat

import static org.springframework.http.HttpStatus.*

class ComprasController {
    def comprar(){
        //Formatando horario
        def sdf = new SimpleDateFormat("dd/MM/yyyy");
        def hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);
        //Fim
        def carrinho = Carrinho.findByUsuario(session.usuario)
        def endereco = session.usuario.estado
        def soma = 0
        (carrinho.produtos).collect{soma=soma+it.preco}
        def qtd = (carrinho.produtos).size()
        carrinho.produtos.removeAll()
        def compra = new Compras('carrinho':carrinho,'enderecoEntrega':endereco,'total':soma,'qtdProduto':qtd,'data':dataFormatada)
        compra.save(flush:true, failOnError: true)
        carrinho.save(flush:true, failOnError: true)
        redirect controller:"menu"
    }
}
