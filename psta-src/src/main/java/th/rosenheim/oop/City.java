package th.rosenheim.oop;

public abstract class City {

    private String cityName;
    private int weatherCondition;

    /**
     * Construct a city with name and weather condition value
     * @param cityName the name of the city
     * @param weatherCondition the value represents the weather in this city
     */

    public City(String cityName, int weatherCondition) {
        this.cityName = cityName;
        this.weatherCondition = weatherCondition;
    }

    public String getCityName() {
        return cityName;
    }

    public int getWeatherCondition() {
        return weatherCondition;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setWeatherCondition(int weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * return webpage contents city weather
     * @return webpage contents in string
     */
    public String getContent(){
        return "<h2>Weather for " + this.cityName + "</h2>"
                + "<p>It is " + WeatherCondition.getWeatherConditionString(this.weatherCondition) + " in " + this.cityName + ".</p>";
    }

    /**
     * abstract method return URL of city websites, to be implemented by subclasses
     * @return the URL
     */
    public abstract String getURL();

    /**
     * Replace the special characters in city names (e.g."ä", "ö" )
     * @param cityName the real city name
     * @return names after replacing special characters
     */
    public String specialName(String cityName){
        return cityName.toLowerCase()
                .replace(" ", "_")
                .replace("ä","ae")
                .replace("ö", "oe")
                .replace("ü", "ue");
    }


}
