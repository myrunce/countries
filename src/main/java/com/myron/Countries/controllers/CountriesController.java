package com.myron.Countries.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myron.Countries.models.City;
import com.myron.Countries.models.Country;
import com.myron.Countries.services.ApiService;

@Controller
public class CountriesController {
	private final ApiService apiService;
	public CountriesController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/")
	public String query(Model model) {
		List<Object[]> countries = apiService.one();
		model.addAttribute("slovene", countries);
		
		List<Object[]> countriesTwo = apiService.two();
//		System.out.println(countriesTwo.get(0).name);
		model.addAttribute("two", countriesTwo);
		
		List<Object[]> three = apiService.three();
//		System.out.println(three);
		model.addAttribute("three", three);
		
		List<Object[]> four = apiService.four();
		model.addAttribute("four", four);
		
		List<Object[]> five = apiService.five();
		model.addAttribute("five", five);
		
		List<Object[]> six = apiService.six();
		model.addAttribute("six", six);
		
		List<Object[]> seven = apiService.seven();
		model.addAttribute("seven", seven);
		
		List<Object[]> eight = apiService.eight();
		model.addAttribute("eight", eight);
		return "index.jsp";
		
	}
}
