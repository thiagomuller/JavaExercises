package com.thiagomuller.SpringMvcDemo.Config;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.concurrent.Callable;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public boolean isValid(String theCode,
                           ConstraintValidatorContext constraintValidatorContext) {

        if(theCode != null){
            boolean result = theCode.startsWith(coursePrefix);
            return result;
        }
        return true;
    }

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }
}
