package com.example.data;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://dashboard.whatabyte.app")
@RestController
public class DataController {
    private final DataRepository repository;

    DataController(DataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/data/buku")
    List<Data> all() {
        return repository.findAll();
    }

    @PostMapping("/api/data/buku")
    Data newData(@RequestBody Data newData) {
        return repository.save(newData);
    }

    @GetMapping("/api/data/buku/{id}")
    Data data(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new DataNotFoundException(id));
    }

    @PutMapping("/api/data/buku/{id}")
    Data editData(@RequestBody Data newData, @PathVariable Long id) {

        return repository.findById(id).map(data -> {
            data.setIsbn(newData.getIsbn());
            data.setJudul(newData.getJudul());
            data.setPenerbit(newData.getPenerbit());
            data.setTahun(newData.getTahun());
            data.setPenulis(newData.getPenulis());
            data.setPrice(newData.getPrice());
            return repository.save(data);
        }).orElseGet(() -> {
            newData.setId(id);
            return repository.save(newData);
        });
    }

    @DeleteMapping("/api/data/buku/{id}")
    void deleteData(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
