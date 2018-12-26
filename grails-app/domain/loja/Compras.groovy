package loja

class Compras {
    String enderecoEntrega
    Double total
    Integer qtdProduto
    String data
    static belongsTo = [carrinho:Carrinho]
    static constraints = {
        enderecoEntrega(blank:false, nullable:false)
        total(blank:false, nullable:false)
        qtdProduto(blank:false, nullable:false)
        data(blank:false, nullable:false)
    }
}
