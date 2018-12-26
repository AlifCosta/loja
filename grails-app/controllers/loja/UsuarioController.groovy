package loja

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class UsuarioController {


    def salvar() {
        def usuario = new Usuario(params)
        if (params.senha == params.confirmacao) {
            def cliente = new Cliente('usuario':usuario)
            def carrinho = new Carrinho('usuario':usuario)
            usuario.save(flush:true, failOnError: true)
            redirect controller: "menu",action:"login"
        }
        else{
            redirect controller: "menu",action:"cadastro"
        }
    }

    def entrar() {
        def usuario = Usuario.findByEmailAndSenha(params.email,params.senha)
        if (usuario.cliente) {
            session.usuario = usuario
            redirect controller: "menu"
        } else if (usuario.administrador) {
            session.usuario = usuario
            render view: "/administracao"
        }
        else{
            render
        }
    }


}