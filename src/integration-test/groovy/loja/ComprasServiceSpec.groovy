package loja

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ComprasServiceSpec extends Specification {

    ComprasService comprasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Compras(...).save(flush: true, failOnError: true)
        //new Compras(...).save(flush: true, failOnError: true)
        //Compras compras = new Compras(...).save(flush: true, failOnError: true)
        //new Compras(...).save(flush: true, failOnError: true)
        //new Compras(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //compras.id
    }

    void "test get"() {
        setupData()

        expect:
        comprasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Compras> comprasList = comprasService.list(max: 2, offset: 2)

        then:
        comprasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        comprasService.count() == 5
    }

    void "test delete"() {
        Long comprasId = setupData()

        expect:
        comprasService.count() == 5

        when:
        comprasService.delete(comprasId)
        sessionFactory.currentSession.flush()

        then:
        comprasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Compras compras = new Compras()
        comprasService.save(compras)

        then:
        compras.id != null
    }
}
