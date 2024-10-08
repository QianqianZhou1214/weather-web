package th.rosenheim.oop;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        init();

        //create the object of WebsiteGenerator
        WebsiteGenerator website = new WebsiteGenerator();
        //add cities to website
        website.addCities(new SmallCity("Rosenheim", WeatherCondition.CLOUDY.ordinal()));
        website.addCities(new BigCity("München", WeatherCondition.RAINY.ordinal(),
                new ArrayList<>(List.of("Schwabing", "Sendling", "Lehel",  "Nymphenburg"))));
        website.addCities(new BigCity("Berlin", WeatherCondition.SUNNY.ordinal(),
                new ArrayList<>(List.of("Kreuzberg", "Charlottenburg", "Prenzlauer Berg", "Friedrichshain", "Neukölln", "Schöneberg"))));

        try{
            website.generateWebsites("The Weather App.html");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void init() {
    }
}
