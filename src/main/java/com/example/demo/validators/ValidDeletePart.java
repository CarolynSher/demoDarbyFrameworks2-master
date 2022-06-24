package com.example.demo.validators;

import javax.validation.Payload;

/**
 * Project: demo
 * Package: com.example.demo.validators
 * <p>
 * User: carolyn.sher
 * Date: 5/19/2022
 * Time: 4:06 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public @interface ValidDeletePart {
    String message() default "Part cannot be deleted if used in a product.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
