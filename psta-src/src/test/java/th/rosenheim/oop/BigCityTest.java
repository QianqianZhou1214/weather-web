package th.rosenheim.oop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BigCityTest {

    private static BigCity berlin;

    @BeforeAll
    public static void setUpClass() {
        berlin = new BigCity("Berlin", WeatherCondition.SUNNY.getNumber(),
                new ArrayList<>(List.of("Kreuzberg", "Charlottenburg", "Prenzlauer Berg", "Friedrichshain", "Neukölln", "Schöneberg")));

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