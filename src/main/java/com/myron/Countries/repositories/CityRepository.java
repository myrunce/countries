package com.myron.Countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myron.Countries.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

	@Query(value="SELECT cities.name, cities.population\r\n" + 
			"FROM countries \r\n" + 
			"JOIN cities \r\n" + 
			"ON countries.id = cities.country_id\r\n" + 
			"WHERE countries.name = 'Mexico' and cities.population > 500000\r\n" + 
			"ORDER BY cities.population desc", nativeQuery = true)
	List<Object[]> three();
	
}
