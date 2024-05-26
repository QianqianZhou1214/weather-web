package th.rosenheim.oop;

import java.util.ArrayList;


public class BigCity extends City {

    private ArrayList<String> districts;

    public BigCity(String cityName, int weatherCondition, ArrayList<String> districts) {
        super(cityName, weatherCondition);
        this.districts = districts;
    }

    @Override
    public String getContent() {
        String districtNames = String.join(", ", districts);
        return "<p>It is " + WeatherCondition.getWeatherConditionString(this.weatherCondition) + " in " + specialName(cityName) + ".</p>" +
                 "<p>This also applied to: " + districtNames + ".</p>";
    }

    @Override
    public String getURL() {
        return "weather_small_city_" + specialName(cityName) + ".html";
    }
}
