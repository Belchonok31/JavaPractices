package ru.belosludtsev.practice15.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.belosludtsev.practice15.models.Manufacture;
import ru.belosludtsev.practice15.services.EmailService;
import ru.belosludtsev.practice15.services.ManufactureService;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
@RequiredArgsConstructor
public class ControlerManufacture {
    private final ManufactureService manufactureService;
    private final EmailService emailService;

    @GetMapping()
    public List<Manufacture> get_manufacture() {
        return manufactureService.findAll();
    }

    @PostMapping("/add")
    public void add_manufacture(@RequestBody Manufacture new_manufacture) {
        emailService.sendAddManufactureEmail(new_manufacture);
        manufactureService.addManufacture(new_manufacture);
    }

    @DeleteMapping("/delete/{name}")
    public void delete_manufacture(@PathVariable("name") String name) {
        manufactureService.deleteManufacture(name);
    }

    @GetMapping("/sortByName")
    public List<Manufacture> sortByName() {
        return manufactureService.sortManuByName();
    }

    @GetMapping("/sortByAddress")
    public List<Manufacture> sortByAddress() {
        return manufactureService.sortManuByAddress();
    }
}
