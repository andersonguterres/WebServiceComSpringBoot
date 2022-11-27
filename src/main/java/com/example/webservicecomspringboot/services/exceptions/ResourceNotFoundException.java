package com.example.webservicecomspringboot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not find. id " + id);
    }
}
