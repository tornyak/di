package com.tornyak.di.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tornyak.di.movie.Movie;

public class Application {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TestModule());
		Movie movie = injector.getInstance(Movie.class);
		movie.show();
	}
}
