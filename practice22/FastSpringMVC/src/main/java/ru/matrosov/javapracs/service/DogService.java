package ru.matrosov.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.matrosov.javapracs.models.Dog;
import ru.matrosov.javapracs.models.Student;
import ru.matrosov.javapracs.repositories.DogRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class DogService {

    private final DogRepository dogRepository;

    @PersistenceContext
    private EntityManager em;

    public Dog create(Dog dog) {
        return dogRepository.save(dog);
    }

    public List<Dog> findAll() {
        log.info("Find all dogs");
        return dogRepository.findAll();
    }

    public void delete(int id) {
        dogRepository.deleteById(id);
    }

    public Student getStudentByDog(int dogId) {

        Session session = em.unwrap(Session.class);


        return session.createQuery("From Dog where id =: dogId", Dog.class)
                .setParameter("dogId",dogId).getSingleResult().getStudent();
    }

    public List<Dog> sortDogsByBreed() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Dog> dogCriteriaQuery = builder.createQuery(Dog.class);
        Root<Dog> root = dogCriteriaQuery.from(Dog.class);

        dogCriteriaQuery.select(root).orderBy(builder.asc(root.get("breed")));
        return session.createQuery(dogCriteriaQuery).getResultList();
    }

    public List<Dog> sortDogsByName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Dog> dogCriteriaQuery = builder.createQuery(Dog.class);
        Root<Dog> root = dogCriteriaQuery.from(Dog.class);

        dogCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        return session.createQuery(dogCriteriaQuery).getResultList();
    }


}
