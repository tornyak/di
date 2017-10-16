package com.tornyak.di.movie.thunderball;

import com.tornyak.di.movie.Villain;

public class Spectre implements Villain {

	@Override
	public void doEvel() {
		System.out.println("Spectre steals the nuclear warheads");	
	}

}
