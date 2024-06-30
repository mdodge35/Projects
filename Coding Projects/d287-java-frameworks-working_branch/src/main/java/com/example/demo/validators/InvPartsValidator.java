package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.stereotype.Component;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class InvPartsValidator implements ConstraintValidator<ValidInvParts, Part> {
    @Override
    public void initialize(ValidInvParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getInv() < part.getMinInv() || part.getInv() > part.getMaxInv()){
            return false;
        } else {
                return true;
        }
    }
}
