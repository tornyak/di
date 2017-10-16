package com.tornyak.di.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.EvilSpectre;
import com.tornyak.di.movie.thunderball.JamesBondJr;
import com.tornyak.di.movie.thunderball.Thunderball;

@Configuration
public class TestConfig {
	@Bean
	protected Hero hero() {
		return new JamesBondJr();
	}
	
	@Bean
	protected Villain villain() {
		return new EvilSpectre();
	}
	
	@Bean
	protected Movie movie() {
		return new Thunderball();
	}
}
