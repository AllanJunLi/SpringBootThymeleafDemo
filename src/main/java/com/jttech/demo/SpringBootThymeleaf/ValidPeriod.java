package com.jttech.demo.SpringBootThymeleaf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PeriodValidator.class})
public @interface ValidPeriod {
	
    String message() default "{endDate.cannot.before.startDate}";

    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

}
