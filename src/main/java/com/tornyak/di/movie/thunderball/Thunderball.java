package com.tornyak.di.movie.thunderball;

import com.tornyak.di.movie.ActionMovie;
import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Villain;

public class Thunderball extends ActionMovie {
	
	public Thunderball() {}
	
	public Thunderball(Hero hero, Villain villain) {
		super(hero, villain);
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}
}
