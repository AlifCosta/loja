package loja

class Categoria{
    String categoria
    static hasOne = [produto:Produto]
    static constraints = {
        categoria(blank:false,nullable:false,mazSize:100,unique: true)
    }
}
