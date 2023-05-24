package ru.belosludtsev.practice15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.belosludtsev.practice15.models.Worker;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
