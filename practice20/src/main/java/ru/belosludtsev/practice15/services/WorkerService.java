package ru.belosludtsev.practice15.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.belosludtsev.practice15.models.Worker;
import ru.belosludtsev.practice15.repositories.WorkerRepository;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class WorkerService {

    @PersistenceContext
    private EntityManager em;
    private final WorkerRepository workerRepository;

    public List<Worker> findAll() {
        log.info("Find all workers");
        return workerRepository.findAll();
    }

    public void addWorker(Worker worker) {
        workerRepository.save(worker);
    }

    public void deleteWorker(String name) {
        workerRepository.delete(Objects.requireNonNull(findWorkerByName(name)));
    }

    private Worker findWorkerByName(String name) {
        for (Worker w : findAll()) {
            if (Objects.equals(w.getFirstName(), name))
                return w;
        }
        return null;
    }

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
