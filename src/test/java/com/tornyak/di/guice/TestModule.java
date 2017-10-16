package com.tornyak.di.guice;

import com.google.inject.AbstractModule;
import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.EvilSpectre;
import com.tornyak.di.movie.thunderball.JamesBondJr;
import com.tornyak.di.movie.thunderball.Thunderball;

public class TestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Hero.class).to(JamesBondJr.class);
		bind(Villain.class).to(EvilSpectre.class);
		bind(Movie.class).to(Thunderball.class);
	}

}
