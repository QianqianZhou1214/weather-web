package th.rosenheim.oop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BigCityTest {

    private static BigCity berlin;

    @BeforeEach
    public void setUpClass() {
        berlin = new BigCity("Berlin", WeatherCondition.SUNNY.ordinal(),
                new ArrayList<>(List.of("Kreuzberg", "Charlottenburg", "Prenzlauer Berg", "Friedrichshain", "Neukölln", "Schöneberg")));

    }


    @Test public void getDistrictsTest(){
        berlin.setDistricts(new ArrayList<>(List.of("Kreuzberg")));
        assertTrue(berlin.getDistricts().contains("Kreuzberg"));
    }

    @Test public void setDistrictsTest(){
        berlin.setDistricts(new ArrayList<>(List.of("Kreuzberg")));
        assertTrue(berlin.getDistricts().contains("Kreuzberg"));
    }

    @Test public void addDistrictsTest(){
        berlin.addDistricts("Prenzlauer Berg");
        assertTrue(berlin.getDistricts().contains("Prenzlauer Berg"));
    }

    @Test public void removeDistrictsTest(){
        berlin.removeDistrict("Mitte");
        assertFalse(berlin.getDistricts().contains("Mitte"));
    }


    @Test public void getContentTest(){
        String expectedContent = "<h2>Weather for Berlin</h2><p>It is sunny in Berlin.</p><p>This also applied to: Kreuzberg, Charlottenburg, Prenzlauer Berg, Friedrichshain, Neukölln, Schöneberg.</p>";
        String content = berlin.getContent();
        assertEquals(expectedContent,content);
    }

    @Test public void getURLTest(){
        String expectedURL = "weather_big_city_berlin.html";
        String url = berlin.getURL();
        assertEquals(expectedURL,url);
    }
  
}