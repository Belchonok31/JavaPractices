package ru.belosludtsev.practice15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.belosludtsev.practice15.models.Manufacture;

public interface ManufactureRepository extends JpaRepository<Manufacture, Integer> {
}
