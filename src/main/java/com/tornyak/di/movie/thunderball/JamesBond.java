package com.tornyak.di.movie.thunderball;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Villain;

public class JamesBond implements Hero {

	@Override
	public void saveTheWorld(Villain villain) {
		System.out.printf("James Bond defeats the %s and saves the world\n", villain.getClass().getSimpleName());
	}
}
