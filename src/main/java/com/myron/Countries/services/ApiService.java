package com.myron.Countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myron.Countries.models.City;
import com.myron.Countries.models.Country;
import com.myron.Countries.repositories.CityRepository;
import com.myron.Countries.repositories.CountryRepository;
import com.myron.Countries.repositories.LanguageRepository;

@Service
public class ApiService {
	private CountryRepository countriesRepository;
	private CityRepository cityRepository;
	private LanguageRepository languageRepository;
	
	public ApiService(CountryRepository countriesRepository, CityRepository cityRepository, LanguageRepository languageRepository) {
		this.countriesRepository = countriesRepository;
		this.cityRepository = cityRepository;
		this.languageRepository = languageRepository;
		
	}
	
	public List<Object[]> one(){
		return countriesRepository.firstQuery();
	}
	
	public List<Object[]> two(){
		return countriesRepository.secondQuery();
	}
	
	public List<Object[]> three(){
		return cityRepository.three();
	}
	
	public List<Object[]> four(){
		return countriesRepository.four();
	}
	
	public List<Object[]> five(){
		return countriesRepository.five();
	}
	
	public List<Object[]> six(){
		return countriesRepository.six();
	}
	
	public List<Object[]> seven(){
		return countriesRepository.seven();
	}
	
	public List<Object[]> eight(){
		return countriesRepository.eight();
	}
}
