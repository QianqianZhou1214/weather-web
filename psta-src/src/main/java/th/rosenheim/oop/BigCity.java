package th.rosenheim.oop;

import java.util.ArrayList;


public class BigCity extends City {

    private ArrayList<String> districts;

    /**
     * Construct a big city with city name, weather condition and it's districts
     * @param cityName big city name
     * @param weatherCondition weather condition value in big city
     * @param districts the list of districts in the big city
     */
    public BigCity(String cityName, int weatherCondition, ArrayList<String> districts) {
        super(cityName, weatherCondition);
        this.districts = districts;
    }

    /**
     * Implement the abstract getContent method from super class City
     * @return return the page contents of big city
     */
    @Override
    public String getContent() {
        String districtNames = String.join(", ", districts);
        return "<h2>Weather for " + specialName(cityName) + ",/h2>" + "<p>It is " + WeatherCondition.getWeatherConditionString(this.weatherCondition) + " in " + specialName(cityName) + ".</p>" +
                 "<p>This also applied to: " + districtNames + ".</p>";
    }

    /**
     * Implement the abstract getURL method from super class
     * @return the URL of big city
     */
    @Override
    public String getURL() {
        return "weather_small_city_" + specialName(cityName) + ".html";
    }
}
