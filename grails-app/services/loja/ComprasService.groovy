package loja

import grails.gorm.services.Service

@Service(Compras)
interface ComprasService {

    Compras get(Serializable id)

    List<Compras> list(Map args)

    Long count()

    void delete(Serializable id)

    Compras save(Compras compras)

}