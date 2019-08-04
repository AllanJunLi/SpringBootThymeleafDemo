package com.jttech.demo.SpringBootThymeleaf;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeriodCalculateController {
	
	@GetMapping("/")
	public String prepareView(CalcPeriod calcPeriod) {
		return "index";
	}
	
	@PostMapping("/calcDays")
	public String calculateDays(@Valid CalcPeriod calcPeriod, BindingResult result, Model model) {		
		if (!result.hasErrors()) {
			model.addAttribute("calcResult", calcPeriod.calcNumberOfDays());
		}
		return "index";
	}

}
