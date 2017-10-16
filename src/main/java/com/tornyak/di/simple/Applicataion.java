package com.tornyak.di.simple;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.JamesBondJr;
import com.tornyak.di.movie.thunderball.EvilSpectre;
import com.tornyak.di.movie.thunderball.Thunderball;

public class Applicataion {
	public static void main(String[] args) {
		Hero hero = new JamesBondJr();
		Villain villain = new EvilSpectre();
		Movie thunderball = new Thunderball(hero, villain);
		thunderball.show();
	}
}
