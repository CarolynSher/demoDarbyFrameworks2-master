package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Project: demo
 * Package: com.example.demo.validators
 * <p>
 * User: carolyn.sher
 * Date: 5/19/2022
 * Time: 4:07 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class DeletePartValidator implements ConstraintValidator<ValidDeletePart, Part> {
    @Override
    public void initialize(ValidDeletePart constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getProducts().isEmpty()) return true;
        else return false;
    }
}
