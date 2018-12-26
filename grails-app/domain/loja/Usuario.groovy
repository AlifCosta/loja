package loja

class Usuario {
    String nome
    String senha
    String email
    String estado
    String pais
    String telefone
    static hasOne=[carrinho:Carrinho,cliente:Cliente,administrador:Administrador]

    static constraints = {
        nome(blank:false, nullable:false,maxSize:200)
        senha(blank:false, nullable:false,maxSize:15,minSize:8)
        email(blank:false, nullable:false,maxSize:50,email:true,unique:true)
        estado(blank:false, nullable:false,maxSize:200)
        pais(blank:false, nullable:false,maxSize:200)
        telefone(blank:false, nullable:false,maxSize:30,unique:true)
        cliente(nullable: true)
        administrador(nullable: true)
        carrinho(nullable:true)
    }
}
