package th.rosenheim.oop;

public enum WeatherCondition {
    SUNNY(0),
    CLOUDY(1),
    RAINY(2);

    private final int number;
    WeatherCondition(int number) {
        this.number = number;
    }

    public String getWeatherConditionString() {
        switch (number) {
            case 0: return "sunny";
            case 1: return "cloudy";
            case 2: return "rainy";
            default: return "unknown";
        }
    }


}
