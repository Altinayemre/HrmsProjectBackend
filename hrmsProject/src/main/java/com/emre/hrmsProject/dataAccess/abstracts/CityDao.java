package com.emre.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emre.hrmsProject.entities.concretes.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer>{

}
