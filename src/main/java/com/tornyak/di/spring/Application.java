package com.tornyak.di.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tornyak.di.movie.Movie;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Movie movie = context.getBean("movie", Movie.class);
        movie.play();
	}
}
