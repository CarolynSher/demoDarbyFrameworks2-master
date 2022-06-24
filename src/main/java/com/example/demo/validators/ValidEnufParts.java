package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project: demo
 * Package: com.example.demo.validators
 * <p>
 * User: carolyn.sher
 * Date: 5/25/2022
 * Time: 4:40 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Constraint(validatedBy = {EnufPartsValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEnufParts {
    String message() default "There aren't enough parts in inventory!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
