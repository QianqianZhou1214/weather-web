package th.rosenheim.oop;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WebsiteGenerator {

    private ArrayList<City> cities;

    /**
     * Constructs a WebsiteGenerator with an empty array list
     */
    public WebsiteGenerator() {
        this.cities = new ArrayList<>();
    }

    /**
     * Add new cities to city list
     * @param newCity the new cities to add
     */

    public void addCities(City newCity) {
        this.cities.add(newCity);
    }

    /**
     * Generates the Navigation Bar for website
     * @return return navigation bar in string
     */
    public String getNavigation(){
        StringBuilder navigation = new StringBuilder();
        navigation.append("<h1>The Weather App</h1><p>");
        for (City city : cities) {
            navigation.append("<a href=").append(city.getURL()).append(">").append(city.cityName).append("</a>");
            navigation.append(" | ");
        }
        navigation.setLength(navigation.length() - cities.size());
        navigation.append("</p>");
        return navigation.toString();
    }

    /**
     * Generates webpages with navigation and contents
     * @param navigation Navigation Bar
     * @param content    The contents of webpages
     * @return return the page with all contents
     */

    public String getPage(String navigation, String content){
        return "<html>\n<body>" + navigation + "\n" + content + "\n<body>\n<html>";
    }

    public void generateWebsites(String websiteName) throws IOException {
        Path path = Path.of(websiteName);
        if(Files.exists(path)){
            Files.delete(path);
        }
        Files.createFile(path);
        Files.write(path, getPage(getNavigation(),"").getBytes());

        for (City city : cities) {
            String cityWeb = getPage(getNavigation(), city.getContent());
            if(Files.exists(Paths.get(city.getURL()))){
                Files.delete(Paths.get(city.getURL()));
            }
            Files.write(Paths.get(city.getURL()), cityWeb.getBytes());
        }


    }




}
