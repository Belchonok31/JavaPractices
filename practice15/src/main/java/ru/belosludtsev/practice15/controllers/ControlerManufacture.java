package ru.belosludtsev.practice15.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.belosludtsev.practice15.dao.ManufactureDAO;
import ru.belosludtsev.practice15.models.Manufacture;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
@RequiredArgsConstructor
public class ControlerManufacture {
    private final ManufactureDAO manufactureDAO;
    @GetMapping()
    public List<Manufacture> get_manufacture(){
        return manufactureDAO.findAll();
    }
    @PostMapping("/add")
    public void add_manufacture(@RequestBody Manufacture new_manufacture){
        manufactureDAO.addManufacture(new_manufacture);
    }
    @DeleteMapping("/delete/{name}")
    public void delete_manufacture(@PathVariable("name") String name){
        manufactureDAO.deleteManufacture(name);
    }
}
