package com.example.demo.model.validation;

import com.example.demo.controller.exception.EntityNotFoundException;

public class Validations {

    public static <T> void entityNotNull(T entity) {
        if (entity == null) throw new EntityNotFoundException();
    }
}
