package loja

class CategoriaController {

    def index() { }
    def listar(Long id){
        def categoria = Categoria.findById(id)
        respond categoria
    }
}
