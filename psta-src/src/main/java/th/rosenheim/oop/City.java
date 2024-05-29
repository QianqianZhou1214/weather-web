package th.rosenheim.oop;

public abstract class City {

    protected String cityName;
    protected int weatherCondition;

    /**
     * Construct a city with name and weather condition value
     * @param cityName the name of the city
     * @param weatherCondition the value represents the weather in this city
     */

    public City(String cityName, int weatherCondition) {
        this.cityName = cityName;
        this.weatherCondition = weatherCondition;
    }

    /**
     * return webpage contents city weather
     * @return webpage contents in string
     */
    public abstract String getContent();

    /**
     * return URL of city websites
     * @return the URL
     */
    public abstract String getURL();

    /**
     * Replace the special characters in city names (e.g."ä", "ö" )
     * @param cityName the real city name
     * @return names after replacing special characters
     */
    protected String specialName(String cityName){
        return cityName
                .replace(" ", "_")
                .replace("ä","ae")
                .replace("ö", "oe")
                .replace("ü", "ue");
    }


}
