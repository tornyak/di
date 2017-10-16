package com.tornyak.di.guice;

import com.google.inject.AbstractModule;
import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.JamesBond;
import com.tornyak.di.movie.thunderball.Spectre;
import com.tornyak.di.movie.thunderball.Thunderball;

public class ThunderballModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Hero.class).to(JamesBond.class);
		bind(Villain.class).to(Spectre.class);
		bind(Movie.class).to(Thunderball.class);
	}

}
