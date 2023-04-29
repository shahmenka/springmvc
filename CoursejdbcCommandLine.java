package com.example.com.menkashah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CoursejdbcCommandLine implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(23667,"devoops", "backend"));
		repository.insert(new Course(23668,"devoops", "backend"));
		repository.insert(new Course(23669,"python", "backend"));
		repository.insert(new Course(23661,"React", "backend"));
		repository.insert(new Course(23662,"docker", "backend"));
		repository.insert(new Course(23663,"javascripts", "backend"));
		repository.insert(new Course(236677,"spring boot", "backend"));
		repository.insert(new Course(2366777,"networking", "backend"));
		
	}

}
