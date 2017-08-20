package com.myron.Countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.myron.Countries.models.City;
import com.myron.Countries.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	@Query(value="SELECT c, l FROM Country c JOIN c.languages l WHERE l.language = 'Slovene' "
			+ "ORDER BY l.percentage DESC")
	List<Object[]> firstQuery();
	
	@Query(value="SELECT countries.name, COUNT(cities.id) AS num_cities FROM countries JOIN cities ON countries.id = cities.country_id GROUP BY countries.id ORDER BY num_cities desc", nativeQuery = true)
	List<Object[]> secondQuery();
	
	@Query(value="select countries.name, languages.language, languages.percentage\r\n" + 
			"from countries\r\n" + 
			"join languages \r\n" + 
			"on countries.id = languages.country_id\r\n" + 
			"where languages.percentage > 89\r\n" + 
			"order by languages.percentage desc", nativeQuery = true)
	List<Object[]> four();
	
	@Query(value="select countries.name, countries.surface_area, countries.population\r\n" + 
			"from countries\r\n" + 
			"where countries.surface_area < 501 and countries.population > 100000", nativeQuery = true)
	List<Object[]> five();
	
	@Query(value="select countries.name, countries.government_form, countries.life_expectancy, countries.capital\r\n" + 
			"from countries\r\n" + 
			"where countries.government_form = 'Constitutional Monarchy' and countries.capital > 200 and countries.life_expectancy > 75", nativeQuery = true)
	List<Object[]> six();
	
	@Query(value="select countries.name AS cname, cities.name, cities.district, cities.population\r\n" + 
			"from countries\r\n" + 
			"join cities on countries.id = cities.country_id\r\n" + 
			"where countries.name = 'Argentina' and cities.district = 'Buenos Aires' and cities.population > 500000", nativeQuery = true)
	List<Object[]> seven();
	
	@Query(value="select countries.region, count(countries.id) as num_countries\r\n" + 
			"from countries\r\n" + 
			"group by countries.region\r\n" + 
			"order by num_countries desc", nativeQuery=true)
	List<Object[]> eight();
}
