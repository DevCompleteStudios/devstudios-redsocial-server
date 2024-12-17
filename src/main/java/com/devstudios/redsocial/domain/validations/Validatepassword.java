package com.devstudios.redsocial.domain.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;




class ValidatePassword implements ConstraintValidator<Password, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if( value == null ) return true;
        return !value.contains(" ") && value.length() < 50 && value.length() > 5;
    }

}
