package com.raspagem.raspagemdedados;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaspagemDeDadosApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RaspagemDeDadosApplication.class, args);
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Dengue").get();

		System.out.println(doc);
	}

}
