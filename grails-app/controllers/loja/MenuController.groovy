package loja

class MenuController {

    def index() {
        render view:"/index"
    }
    def login(){
        render view: "/login"
    }
    def cadastro(){
        render view: "/cadastrar"
    }
    def contatar(){
        render view: "/contato"
    }
    def logout(){
        session.usuario = null
        session.invalidate()
        render view:"/index"
    }
    def cadastrarCategoria(){
        render view: "/cadastrar-categorias"
    }
    def cadastrarProdutos(){
        render view: "/cadastrar-produtos"
    }
    def cadastrarAdministrador(){
        render view: "/cadastrar_administrador"
    }
}
