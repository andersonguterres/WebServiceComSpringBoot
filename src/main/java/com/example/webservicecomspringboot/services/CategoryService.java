package com.example.webservicecomspringboot.services;

import com.example.webservicecomspringboot.entities.Category;
import com.example.webservicecomspringboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findByID(Long id) {
        return categoryRepository.findById(id);
    }

}
