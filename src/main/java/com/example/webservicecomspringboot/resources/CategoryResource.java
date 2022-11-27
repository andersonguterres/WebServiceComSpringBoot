package com.example.webservicecomspringboot.resources;

import com.example.webservicecomspringboot.entities.Category;
import com.example.webservicecomspringboot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/category")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/findAll")
    private ResponseEntity<List<Category>> findAll() {
        List<Category> categoryList = categoryService.findAll();
        return ResponseEntity.ok().body(categoryList);
    }

    @GetMapping(path = "/{id}")
    private ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
        Optional<Category> category = categoryService.findByID(id);
        return ResponseEntity.ok().body(category);
    }
}
