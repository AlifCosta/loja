package loja

import grails.gorm.services.Service

@Service(Carrinho)
interface CarrinhoService {

    Carrinho get(Serializable id)

    List<Carrinho> list(Map args)

    Long count()

    void delete(Serializable id)

    Carrinho save(Carrinho carrinho)

}