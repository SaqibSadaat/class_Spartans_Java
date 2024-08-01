package week_1.day_2;

public class Test {
    public static void main(String [] args) {

  String[] cities = {"Kabul", "Dubai", "Loss Angeles", "London", "Karachi"};
  for(int x = 0; x < cities.length; x++) {
      String city = cities [x];

      if(city.startsWith("K"))
      System.out.println(city);

  }
    }
}
