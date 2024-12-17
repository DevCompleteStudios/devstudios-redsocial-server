package com.devstudios.redsocial.domain.validations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidatePassword.class)
public @interface Password {
    String message() default "El nombre de usuario no es válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
