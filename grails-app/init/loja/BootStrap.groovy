package loja

class BootStrap {

    def init = { servletContext ->
        def usuario = new Usuario('email': 'admin@admin.com', 'nome':'ADMIN','senha':'123456789','telefone':'999999999','estado': 'RN','pais':'Brasil')
        def administrador  = new Administrador('usuario': usuario)
        def carrinho = new Carrinho('usuario':usuario)
        usuario.administrador = administrador
        usuario.carrinho = carrinho
        carrinho.save(flush:true,failOnError:true)
        administrador.save(flush:true,failOnError:true)
        usuario.save(flush:true,failOnError:true)
    }
    def destroy = {
    }
}
