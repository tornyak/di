package com.tornyak.di.movie.thunderball;

import com.tornyak.di.movie.Hero;
import com.tornyak.di.movie.Villain;

public class JamesBondJr implements Hero {

	@Override
	public void saveTheWorld(Villain villain) {
		System.out.printf("James Bond Jr. tries to save the world but fails.\n"+
				" %s beats him  and conquers the world!\n", villain.getClass().getSimpleName());
	}
}
