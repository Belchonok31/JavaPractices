package ru.belosludtsev.practice15.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.belosludtsev.practice15.models.Worker;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService {

    @PersistenceContext
    private EntityManager em;

    public List<Worker> sortWorkerByFirstName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Worker> workerCriteriaQuery = builder.createQuery(Worker.class);
        Root<Worker> root = workerCriteriaQuery.from(Worker.class);

        workerCriteriaQuery.select(root).orderBy(builder.asc(root.get("firstName")));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }
    public List<Worker> sortWorkerByLastName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Worker> workerCriteriaQuery = builder.createQuery(Worker.class);
        Root<Worker> root = workerCriteriaQuery.from(Worker.class);

        workerCriteriaQuery.select(root).orderBy(builder.asc(root.get("lastName")));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }
    public List<Worker> sortWorkerByMiddleName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Worker> workerCriteriaQuery = builder.createQuery(Worker.class);
        Root<Worker> root = workerCriteriaQuery.from(Worker.class);

        workerCriteriaQuery.select(root).orderBy(builder.asc(root.get("middleName")));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }

}
