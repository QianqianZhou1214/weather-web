package th.rosenheim.oop;

public abstract class City {

    protected String cityName;
    protected int weatherCondition;

    public City(String cityName, int weatherCondition) {
        this.cityName = cityName;
        this.weatherCondition = weatherCondition;
    }

    public abstract String getContent();

    public abstract String getURL();

    protected String specialCase(String cityName){
        return cityName.toLowerCase()
                .replace(" ", "_")
                .replace("ä","ae")
                .replace("ö", "oe")
                .replace("ü", "ue");
    }


}
