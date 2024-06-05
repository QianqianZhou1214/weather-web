package th.rosenheim.oop;

public class SmallCity extends City {

    /**
     * Constructs a small city with name and weather condition
     * @param cityName small city name
     * @param weatherCondition small city weather condition
     */
    public SmallCity(String cityName, int weatherCondition) {

        super(cityName, weatherCondition);

    }

    /**
     * Override (redefine) the methods from superclass
     * @return return the page contents for small city
     */
    @Override
    public String getContent() {

        return super.getContent();

    }

    /**
     * Implement the abstract getURL method from super class
     * @return return the URL of small city
     */
    @Override
    public String getURL() {

        return "weather_small_city_" + specialName(this.getCityName()) + ".html";

    }
}
