package loja

class Carrinho {
    static belongsTo=[usuario:Usuario]
    static hasMany = [produtos:Produto]
    static hasOne = [compra:Compras]


    static constraints = {
        compra(nullable:true,blank:true)
        produtos(nullable:true,blank:true)
    }
}
