package ru.belosludtsev.practice15.services;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.belosludtsev.practice15.models.Manufacture;
import ru.belosludtsev.practice15.models.Worker;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ManufactureService {
    @PersistenceContext
    private EntityManager em;

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
