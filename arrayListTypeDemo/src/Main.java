import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> cities = new ArrayList<String>();
      cities.add("Berlin");
      cities.add("New York");
      cities.add("Istanbul");
      cities.add("Amsterdam");
      cities.add("London");
      cities.add("Sidney");
      cities.remove("Amsterdam");

      Collections.sort(cities);
        System.out.println(cities); // [Berlin, Istanbul, London, New York, Sidney]

      for (String city : cities){
          System.out.println(city);
      }
    }
}
