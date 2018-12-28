package loja

class CategoriaController {

    def index() { }
    def listar(Long id){
        def categoria = Categoria.findById(id)
        respond categoria
    }
    def salvar(){
        def categoria = new Categoria(params)
        categoria.save(flush:true, failOnError:true)
        redirect controller:"menu"
    }
}
