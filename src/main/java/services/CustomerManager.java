package services;

import app.gestioncli.entity.Customer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@RequestScoped
public class CustomerManager {
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }

    @Transactional
    public Customer update(Customer customer) {
       return em.merge(customer);
    }

    @Transactional
    public void persist(Customer customer) {
       em.persist(customer);
    }
}
