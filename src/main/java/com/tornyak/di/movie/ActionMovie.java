package com.tornyak.di.movie;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.inject.Inject;

public abstract class ActionMovie implements Movie {

	@Inject
	@Autowired
	private Hero hero;
	
	@Inject
	@Autowired
	private Villain villain;
	
	public ActionMovie() {}
	
	public ActionMovie(Hero hero, Villain villain) {
		this.hero = hero;
		this.villain = villain;
	}

	@Override
	public void play() {
		System.out.println("Showing: " + this.name());
		villain.doEvel();
		hero.saveTheWorld(villain);
	}
}
