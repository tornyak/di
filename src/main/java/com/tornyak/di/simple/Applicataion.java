package com.tornyak.di.simple;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Movie;
import com.tornyak.di.movie.Villain;
import com.tornyak.di.movie.thunderball.JamesBond;
import com.tornyak.di.movie.thunderball.Spectre;
import com.tornyak.di.movie.thunderball.Thunderball;

public class Applicataion {
	public static void main(String[] args) {
		Hero hero = new JamesBond();
		Villain villain = new Spectre();
		Movie thunderball = new Thunderball(hero, villain);
		thunderball.play();
	}
}
