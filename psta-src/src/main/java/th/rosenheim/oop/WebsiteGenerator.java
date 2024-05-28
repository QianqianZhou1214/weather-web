package th.rosenheim.oop;

import java.nio.file.Files;
import java.util.ArrayList;

public class WebsiteGenerator {

    private ArrayList<City> cities;

    public WebsiteGenerator() {
        this.cities = new ArrayList<>();
    }

    public void addCities(City newCity) {
        this.cities.add(newCity);
    }

    public String getNavigation(){
        StringBuilder navigation = new StringBuilder();
        navigation.append("<h1>The Weather App</h1><p>");
        navigation.append("\n");
        for (City city : cities) {
            navigation.append("<p><a href=").append(city.getURL()).append(">").append(city.cityName).append("</a>");
            navigation.append(" | ");
        }
        navigation.append("</p>");
        return navigation.toString();
    }

    public String getPage(String navigation, String content){
        return "<html>\n<body>" + navigation + "\n" + content + "\n<body>\n<html>";
    }




}
