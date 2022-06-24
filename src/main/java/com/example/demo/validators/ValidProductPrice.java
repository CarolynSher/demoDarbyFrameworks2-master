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
 * Date: 5/19/2022
 * Time: 11:44 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Constraint(validatedBy = {PriceProductValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidProductPrice {
    String message() default "Price of the product must be greater than the sum of the price of the parts.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
