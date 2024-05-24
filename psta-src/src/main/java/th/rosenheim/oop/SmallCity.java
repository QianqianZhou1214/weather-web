package th.rosenheim.oop;

public class SmallCity extends City {

    public SmallCity(String cityName, int weatherCondition) {

        super(cityName, weatherCondition);

    }

    @Override
    public String getContent() {

        return "<p>It is " + weatherCondition + " in " + specialName(cityName) + ".</p>";

    }

    @Override
    public String getURL() {

        return "weather_small_city_" + specialName(cityName) + ".html";

    }
}
