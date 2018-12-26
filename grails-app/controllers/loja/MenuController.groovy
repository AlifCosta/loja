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
        render view:"/index"
    }
}
