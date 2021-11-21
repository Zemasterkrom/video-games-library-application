package com.rk.videogameslibraryapplication;

import com.rk.videogameslibraryapplication.dao.VideoGameRepository;
import com.rk.videogameslibraryapplication.model.VideoGame;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoGameLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameLibraryApplication.class, args);
	}
}
