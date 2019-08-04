package com.jttech.demo.SpringBootThymeleaf;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@ValidPeriod
public class CalcPeriod {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate startDate = LocalDate.now();
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate endDate = LocalDate.now();
	
	public long calcNumberOfDays() {
		if (startDate != null && endDate != null) {
			return ChronoUnit.DAYS.between(startDate, endDate);
		}
		return 0;
	}
}
