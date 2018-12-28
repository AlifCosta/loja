package loja

class Produto{
    String nome
    Double preco
    Integer estoque
    String foto
    Integer qtd
    static hasMany = [carrinhos:Carrinho]
    static belongsTo = [categoria:Categoria,carrinhos:Carrinho]
    static constraints = {
        preco(blank:false, nullable:false)
        estoque(blank:false, nullable:false)
        nome(blank:false, nullable:false)
        foto(blank:false, nullable:false)
        categoria(nullable:true,blank:true)
        qtd(nullable:true,blank:true)
        carrinhos(nullable:true)

    }
}
