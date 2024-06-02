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

    public void removeCities(City city) {
        this.cities.remove(city);
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
     * Generates webpages structure with navigation and contents
     * @param navigation In each page we need a Navigation Bar
     * @param content    We need the weather contents for each page
     * @return return the page with whole contents (navigation and contents)
     */

    public String generatePage(String navigation, String content){
        return "<html>\n<body>" + navigation + "\n" + content + "\n<body>\n<html>";
    }

    /**
     * Create html files and write corresponding contents (getNavigation and contents) into files
     * @param websiteName the file path (names + type e.g. index.html)
     * @throws IOException check for if an I/O error occurs
     */

    public void generateWebsites(String websiteName) throws IOException {
        Path path = Path.of(websiteName); //firstly created an index of the webapp where we can see only cities name
        if(Files.exists(path)){
            Files.delete(path);
        }//if the file exists, we delete it in case we always have the most up-to-date files.
        Files.createFile(path);
        Files.write(path, generatePage(getNavigation(),"").getBytes());

        for (City city : cities) {
            String cityWeb = generatePage(getNavigation(), city.getContent());
            if(Files.exists(Paths.get(city.getURL()))){
                Files.delete(Paths.get(city.getURL()));
            }
            Files.write(Paths.get(city.getURL()), cityWeb.getBytes());
        }//for each city we created different html files with specific contents


    }




}
