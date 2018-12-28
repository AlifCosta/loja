package loja

class Categoria{
    String nome
    static hasMany = [produtos:Produto]
    static constraints = {
        nome(blank:false,nullable:false,mazSize:100,unique: true)
    }
}
