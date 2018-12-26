package loja

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CarrinhoController {

    CarrinhoService carrinhoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond carrinhoService.list(params), model:[carrinhoCount: carrinhoService.count()]
    }

    def show(Long id) {
        respond carrinhoService.get(id)
    }

    def create() {
        respond new Carrinho(params)
    }

    def save(Carrinho carrinho) {
        if (carrinho == null) {
            notFound()
            return
        }

        try {
            carrinhoService.save(carrinho)
        } catch (ValidationException e) {
            respond carrinho.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'carrinho.label', default: 'Carrinho'), carrinho.id])
                redirect carrinho
            }
            '*' { respond carrinho, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond carrinhoService.get(id)
    }

    def update(Carrinho carrinho) {
        if (carrinho == null) {
            notFound()
            return
        }

        try {
            carrinhoService.save(carrinho)
        } catch (ValidationException e) {
            respond carrinho.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'carrinho.label', default: 'Carrinho'), carrinho.id])
                redirect carrinho
            }
            '*'{ respond carrinho, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        carrinhoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'carrinho.label', default: 'Carrinho'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'carrinho.label', default: 'Carrinho'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
