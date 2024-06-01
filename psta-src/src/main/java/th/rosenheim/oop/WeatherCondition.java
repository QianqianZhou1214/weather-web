package th.rosenheim.oop;

public enum WeatherCondition {
    SUNNY,
    CLOUDY,
    RAINY;

    /**
     * Return names in string of the weather conditions by given integer numbers
     * @param number the integer value corresponding to weather conditions
     * @return the names of weather conditions
     */
    public static String getWeatherConditionString(int number) {
        switch (number) {
            case 0: return "sunny";
            case 1: return "cloudy";
            case 2: return "rainy";
            default: return "unknown";
        }
    }


}
