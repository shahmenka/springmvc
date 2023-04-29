package com.example.com.menkashah;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class CourseJdbcRepository {

	
	@Autowired
	private JdbcTemplate springjdbcTemplate;

	private static String INSERT_QUERY=	
			""" 
			
		       insert into course(id, name, author)
                values(?, ?, ?);
     		""";

	public void insert(Course course) {
	     springjdbcTemplate.update(INSERT_QUERY,
	    		 course.getId(), course.getName(), course.getAuthor());
	}
}
