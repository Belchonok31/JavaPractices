package ru.belosludtsev.practice15.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.belosludtsev.practice15.models.Manufacture;

import java.util.List;

@NoArgsConstructor
@Component
@Transactional
public class ManufactureDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Manufacture> findAll(){
        Session session = em.unwrap(Session.class);
        return session.createQuery("SELECT f from Manufacture f", Manufacture.class).getResultList();
    }
    public void addManufacture(Manufacture manufacture) {
        Session session = em.unwrap(Session.class);
        session.persist(manufacture);
        session.close();
    }

    public void deleteManufacture(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Manufacture where name =: name");

        Object manufacture = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(manufacture);
        session.close();
    }
}
