package loja

class Cliente {
    static belongsTo=[usuario:Usuario]
    static hasMany = [compras:Compras]

    static constraints = {
        compras(nullable: true)
    }
}
