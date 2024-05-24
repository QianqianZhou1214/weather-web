package th.rosenheim.oop;

public class BigCity extends City {
    public BigCity(String cityName, int weatherCondition) {
        super(cityName, weatherCondition);
    }

    @Override
    public String getContent() {
        return "";
    }

    @Override
    public String getURL() {
        return "";
    }
}
