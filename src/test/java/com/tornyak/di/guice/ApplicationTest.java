package com.tornyak.di.guice;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tornyak.di.movie.Movie;

public class ApplicationTest {

	@Test
	public void showMovie() {
		Injector injector = Guice.createInjector(new TestModule());
		Movie movie = injector.getInstance(Movie.class);
		movie.play();
	}

}
