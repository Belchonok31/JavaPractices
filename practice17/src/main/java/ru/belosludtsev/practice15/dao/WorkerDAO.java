package ru.belosludtsev.practice15.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.belosludtsev.practice15.models.Worker;

import java.util.List;

@NoArgsConstructor
@Component
@Transactional
public class WorkerDAO {

    @PersistenceContext
    private EntityManager em;


    public List<Worker> findAll() {
        Session session = em.unwrap(Session.class);
        return session
                .createQuery("SELECT f from Worker f", Worker.class).getResultList();
    }

    public void addWorker(Worker worker) {
        Session session = em.unwrap(Session.class);
        session.persist(worker);
        session.close();
    }

    public void deleteWorker(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Worker where firstName =: name");

        Object worker = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(worker);

        session.close();
    }

}
