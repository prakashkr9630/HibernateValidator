package com.cs;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidateList {

	
	public static void main(String[] args) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
		WrapperEmployee wemp= new WrapperEmployee();
        wemp.setEmployee(Util.getData());
        
        Set<ConstraintViolation<WrapperEmployee>> constraintViolations = validator.validate(wemp);
        if (constraintViolations.size() > 0) {
            for (ConstraintViolation<WrapperEmployee> violation : constraintViolations) {
                //System.out.println(violation.getMessage());
            	System.out.println(violation.getMessageTemplate());
            }
        } else {
            System.out.println("Valid Object");
        }
	}
}
