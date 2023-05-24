package ru.belosludtsev.practice15.services;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.belosludtsev.practice15.models.Manufacture;
import ru.belosludtsev.practice15.models.Worker;
import ru.belosludtsev.practice15.repositories.ManufactureRepository;
import ru.belosludtsev.practice15.repositories.WorkerRepository;

import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class ManufactureService {
    @PersistenceContext
    private EntityManager em;

    private final ManufactureRepository manufactureRepository;

    public List<Manufacture> findAll() {
        return manufactureRepository.findAll();
    }

    public void addManufacture(Manufacture manufacture) {
        manufactureRepository.save(manufacture);
    }

    public void deleteManufacture(String name) {
        manufactureRepository.delete(Objects.requireNonNull(findManufactureByName(name)));
    }

    private Manufacture findManufactureByName(String name) {
        for (Manufacture w : findAll()) {
            if (Objects.equals(w.getName(), name))
                return w;
        }
        return null;
    }

    public List<Manufacture> sortManuByName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Manufacture> manufactureCriteriaQuery = builder.createQuery(Manufacture.class);
        Root<Manufacture> root = manufactureCriteriaQuery.from(Manufacture.class);

        manufactureCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        return session.createQuery(manufactureCriteriaQuery).getResultList();
    }
    public List<Manufacture> sortManuByAddress() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Manufacture> manufactureCriteriaQuery = builder.createQuery(Manufacture.class);
        Root<Manufacture> root = manufactureCriteriaQuery.from(Manufacture.class);

        manufactureCriteriaQuery.select(root).orderBy(builder.asc(root.get("address")));
        return session.createQuery(manufactureCriteriaQuery).getResultList();
    }
}
