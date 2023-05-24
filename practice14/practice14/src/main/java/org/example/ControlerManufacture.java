package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
@RequiredArgsConstructor
public class ControlerManufacture {
    private final Manufacture manufacture;
    @GetMapping
    public List<Manufacture> get_manufacture(){
        manufacture.fill_array();
        return manufacture.getManufactures();
    }
    @PostMapping("/add")
    public void add_manufacture(@RequestBody Manufacture new_manufacture){
        manufacture.add_manufacture(new_manufacture);
    }
    @DeleteMapping("/delete/{name}")
    public void delete_manufacture(@PathVariable("name") String name){
        manufacture.delete_manufacture(name);
    }
}
