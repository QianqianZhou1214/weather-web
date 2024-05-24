package th.rosenheim.oop;

public class SmallCity extends City {

    public SmallCity(String cityName, int weatherCondition) {
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
