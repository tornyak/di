package com.tornyak.di.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tornyak.di.movie.Movie;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestConfig.class)
public class ApplicationTests {
	
	@Autowired
	Movie movie;

	@Test
	public void showMovie() {
		movie.play();
	}

}
