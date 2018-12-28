package loja

class Carrinho {
    static belongsTo=[usuario:Usuario]
    static hasMany = [produtos:Produto,compras:Compras]


    static constraints = {
        compras(nullable:true,blank:true)
        produtos(nullable:true,blank:true)
        usuario(unique:true)
    }
}
