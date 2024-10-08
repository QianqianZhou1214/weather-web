package th.rosenheim.oop;

import java.util.ArrayList;


public class BigCity extends City {

    private ArrayList<String> districts;

    /**
     * Construct a big city with city name, weather condition and it's districts
     * @param cityName big city name
     * @param weatherCondition weather condition value in big city
     * @param districts the list of districts in the big city
     */
    public BigCity(String cityName, int weatherCondition, ArrayList<String> districts) {
        super(cityName, weatherCondition);
        this.districts = districts;
    }

    public ArrayList<String> getDistricts() {
        return this.districts;
    }//getter

    public void setDistricts(ArrayList<String> districts) {
        this.districts = districts;
    }//setter

    /**
     * Add districts in case we have more districts in the future
     * @param newDistrict districts to be added
     */
    public void addDistricts(String newDistrict){
        this.districts.add(newDistrict);
    }

    /**
     * Remove districts, in case we have to remove some in the future
     * @param district districts to be removed
     */
    public void removeDistrict(String district){
        this.districts.remove(district);
    }

    /**
     * Redefine method getContent from superclass with big city's specific implementation
     * @return return the page contents of big city
     */
    @Override
    public String getContent() {
        StringBuilder districtNames = new StringBuilder();
        for (int i = 0; i < districts.size(); i++) {
            districtNames.append(districts.get(i));
            if(i < districts.size() - 1){
                districtNames.append(", ");
            }
        }
        return super.getContent() + "<p>This also applied to: " + districtNames + ".</p>";
    }

    /**
     * Implement the abstract getURL method from super class
     * @return the URL of big city
     */
    @Override
    public String getURL() {
        return "weather_big_city_" + specialName(this.getCityName()) + ".html";
    }
}
