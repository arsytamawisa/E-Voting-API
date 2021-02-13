package com.example.demo.models.validation;

import com.example.demo.controllers.exceptions.EntityNotFoundException;

public class Validations {

    public static <T> void entityNotNull(T entity) {
        if (entity == null) throw new EntityNotFoundException();
    }
}
