package loja

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class UsuarioController {


    def salvar() {
        def usuario = new Usuario(params)
        if (params.senha == params.confirmacao) {
            def cliente = new Cliente('usuario':usuario)
            def carrinho = new Carrinho('usuario':usuario)
            usuario.cliente = cliente
            usuario.save(flush:true, failOnError: true)
            redirect controller: "menu",action:"login"
        }
        else{
            redirect controller: "menu",action:"cadastro"
        }
    }

    def entrar() {
        def usuario = Usuario.findByEmailAndSenha(params.email,params.senha)
        if (usuario) {
            session.usuario = usuario
            redirect controller: "menu"
        }
        else{
            render view:"/login", model: [status:"Usuario e/ou senha estão inválidos"]
        }
    }


}