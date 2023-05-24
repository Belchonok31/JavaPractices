package ru.belosludtsev.practice15.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.belosludtsev.practice15.models.Worker;
import ru.belosludtsev.practice15.services.WorkerService;

import java.util.List;
@RestController
@RequestMapping("/worker")
@RequiredArgsConstructor
public class ControlerWorker {

    private final WorkerService workerService;

    @GetMapping()
    public List<Worker> get_worker(){

        return workerService.findAll();
    }
    @PostMapping("/add")
    public void add_worker(@RequestBody Worker new_worker){
        workerService.addWorker(new_worker);
    }
    @DeleteMapping("/delete/{name}")
    public void deleter_worker(@PathVariable("name") String firstname){
        workerService.deleteWorker(firstname);
    }

    @GetMapping("/sortByFirstname")
    public List<Worker> sortByFN() {
        return workerService.sortWorkerByFirstName();
    }
    @GetMapping("/sortByLastname")
    public List<Worker> sortByLN() {
        return workerService.sortWorkerByLastName();
    }
    @GetMapping("/sortByMiddlename")
    public List<Worker> sortByMN() {
        return workerService.sortWorkerByMiddleName();
    }

}
