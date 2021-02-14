package com.example.demo.model.validation.alphabetic;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AlphabeticValidator implements ConstraintValidator<Alphabetic, String> {

    private Alphabetic alphabetic;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        return s == null || s.matches("[A-Za-z]+");
    }
}
