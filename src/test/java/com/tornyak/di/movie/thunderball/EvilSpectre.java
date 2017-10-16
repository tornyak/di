package com.tornyak.di.movie.thunderball;

import com.tornyak.di.movie.Villain;

public class EvilSpectre implements Villain {

	@Override
	public void doEvel() {
		System.out.println("EvilSpectre steals the nuclear warheads");	
	}

}
