package loja

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CarrinhoServiceSpec extends Specification {

    CarrinhoService carrinhoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Carrinho(...).save(flush: true, failOnError: true)
        //new Carrinho(...).save(flush: true, failOnError: true)
        //Carrinho carrinho = new Carrinho(...).save(flush: true, failOnError: true)
        //new Carrinho(...).save(flush: true, failOnError: true)
        //new Carrinho(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //carrinho.id
    }

    void "test get"() {
        setupData()

        expect:
        carrinhoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Carrinho> carrinhoList = carrinhoService.list(max: 2, offset: 2)

        then:
        carrinhoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        carrinhoService.count() == 5
    }

    void "test delete"() {
        Long carrinhoId = setupData()

        expect:
        carrinhoService.count() == 5

        when:
        carrinhoService.delete(carrinhoId)
        sessionFactory.currentSession.flush()

        then:
        carrinhoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Carrinho carrinho = new Carrinho()
        carrinhoService.save(carrinho)

        then:
        carrinho.id != null
    }
}
