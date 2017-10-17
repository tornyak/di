package com.tornyak.di.simple;

import org.junit.Test;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.EvilSpectre;
import com.tornyak.di.movie.thunderball.JamesBondJr;
import com.tornyak.di.movie.thunderball.Thunderball;

public class AplicationTest {
	
	@Test
	public void showMovie() {
		Hero hero = new JamesBondJr();
		Villain villain = new EvilSpectre();
		Movie movie = new Thunderball(hero, villain);
		movie.play();
	}
}
