package com.example.QuizPapeleria;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizPapeleriaApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(QuizPapeleriaApplication.class, args);
	}

	private static void loadEnv(){
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME" ,dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD" ,dotenv.get("DB_PASSWORD"));
	}

}



