package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/worker")
@RequiredArgsConstructor
public class ControlerWorker {
    private final Worker worker;
    @GetMapping()
    public List<Worker> get_worker(){
        worker.fill_array();
        return worker.get_worker();
    }
    @PostMapping("/add")
    public void add_worker(@RequestBody Worker new_worker){
        worker.add_worker(new_worker);
    }
    @DeleteMapping("/delete/{name}")
    public void deleter_worker(@PathVariable("name") String firstname){
        worker.delete_worker(firstname);
    }

}
