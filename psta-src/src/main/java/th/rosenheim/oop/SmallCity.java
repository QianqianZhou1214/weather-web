package th.rosenheim.oop;

public class SmallCity extends City {

    /**
     * Constructs a small city with name and weather condition
     * @param cityName
     * @param weatherCondition
     */
    public SmallCity(String cityName, int weatherCondition) {

        super(cityName, weatherCondition);

    }

    /**
     * Implement the abstract getContent method from super class City
     * @return return the page contents for small city
     */
    @Override
    public String getContent() {

        return "<h2>Weather for " + this.cityName + "</h2>"
                + "<p>It is " + WeatherCondition.getWeatherConditionString(this.weatherCondition) + " in " + this.cityName + ".</p>";

    }

    /**
     * Implement the abstract getURL method from super class
     * @return return the URL of small city
     */
    @Override
    public String getURL() {

        return "weather_small_city_" + specialName(cityName) + ".html";

    }
}
