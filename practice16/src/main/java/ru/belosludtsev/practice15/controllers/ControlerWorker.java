package ru.belosludtsev.practice15.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.belosludtsev.practice15.dao.WorkerDAO;
import ru.belosludtsev.practice15.models.Worker;

import java.util.List;
@RestController
@RequestMapping("/worker")
@RequiredArgsConstructor
public class ControlerWorker {

    private final WorkerDAO workerDAO;

    @GetMapping()
    public List<Worker> get_worker(){
        return workerDAO.findAll();
    }
    @PostMapping("/add")
    public void add_worker(@RequestBody Worker new_worker){
        workerDAO.addWorker(new_worker);
    }
    @DeleteMapping("/delete/{name}")
    public void deleter_worker(@PathVariable("name") String firstname){
        workerDAO.deleteWorker(firstname);
    }

}
