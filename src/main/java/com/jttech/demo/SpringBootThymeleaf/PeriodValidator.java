package com.jttech.demo.SpringBootThymeleaf;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PeriodValidator implements ConstraintValidator<ValidPeriod, CalcPeriod>{

	@Override
	public boolean isValid(CalcPeriod period, ConstraintValidatorContext context) {
		if (period.getEndDate() == null || period.getStartDate() == null) {
			return false;
		}
		return period.getEndDate().compareTo(period.getStartDate()) >= 0;
	}

}
