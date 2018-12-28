package loja

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AdministradorController {
    def salvar(){
        def usuario = new Usuario(params)
        def administrador = new Administrador('usuario':usuario)
        usuario.administrador = administrador
        administrador.save(flush:true, failOnError:true)
        usuario.save(flush:true, failOnError:true)
        redirect controller:"menu"
    }
}
