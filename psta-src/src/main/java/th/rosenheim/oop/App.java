package th.rosenheim.oop;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        init();
    }

    public static void init() {

        //create objects of small and big cities and initialize the constructors
        //initialize the big cities constructor with a new arraylist in order to add districts

        SmallCity rosenheim = new SmallCity("Rosenheim", WeatherCondition.CLOUDY.ordinal());

        BigCity munich = new BigCity("München", WeatherCondition.RAINY.ordinal(),
                new ArrayList<>());
        //add districts for big cities
        munich.addDistricts("Schwabing");
        munich.addDistricts("Sendling");
        munich.addDistricts("Lehel");
        munich.addDistricts("Nymphenburg");

        //can also initialize the arraylist with districts names, if we have more to add later, we can use addDistricts() method
        BigCity berlin = new BigCity("Berlin", WeatherCondition.SUNNY.ordinal(),
                new ArrayList<>(List.of("Kreuzberg", "Charlottenburg", "Prenzlauer Berg", "Friedrichshain", "Neukölln", "Schöneberg")));

        //create the object of WebsiteGenerator, the constructor automatically creates a new ArrayList for cities in the website
        WebsiteGenerator website = new WebsiteGenerator();
        //add cities to website
        website.addCities(rosenheim);
        website.addCities(munich);
        website.addCities(berlin);

        berlin.removeDistrict("Kreuzberg");

        try{
            website.generateWebsites("The Weather App.html");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
