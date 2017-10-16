package com.tornyak.di.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.JamesBond;
import com.tornyak.di.movie.thunderball.Spectre;
import com.tornyak.di.movie.thunderball.Thunderball;

@Configuration
public class ThunderballConfig {
	@Bean
	protected Hero hero() {
		return new JamesBond();
	}
	
	@Bean
	protected Villain villain() {
		return new Spectre();
	}
	
	@Bean
	protected Movie movie() {
		return new Thunderball();
	}
}
