package com.raspagem;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Document doc = Jsoup.connect("https://torrentjogos.net/mortal-kombat-1-pc").get();
        System.out.println(doc.getElementsByClass("jogogeneroz"));
    }
}
