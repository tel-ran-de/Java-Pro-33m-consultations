import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

//Найти маршрут из заданного списка билетов
//  Учитывая список билетов, найти маршрут по порядку, используя данный список.
//  Вход:
//  «Berlin» -> «London»
//  «Tokyo» -> «Seoul»
//  «Mumbai» -> «Berlin»
//  «Seoul» -> «Mumbai»
//
//  Выход:
//  Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon


public class Routes {
  public static void main(String[] args) {
    Map<String, String> cityMap = new HashMap<>();
    cityMap.put("Berlin", "London");
    cityMap.put("Tokyo", "Seoul");
    cityMap.put("Mumbai", "Berlin");
    cityMap.put("Tel-Aviv", "Milan");
    cityMap.put("Seoul", "Mumbai");
    cityMap.put("London", "Helsinki");
    cityMap.put("kkk", "ff");

    getRoute(cityMap);
  }

  private static void getRoute(Map<String, String> cityMap) {
    Map<String, String> reverseMap = new HashMap<>();

    for (Map.Entry<String, String> entry : cityMap.entrySet()) {
      reverseMap.put(entry.getValue(), entry.getKey());
    }

    String start = null;


    for (Map.Entry<String, String> entry : cityMap.entrySet()) {
      if (!reverseMap.containsKey(entry.getKey())) {
        start = entry.getKey();

        System.out.println("Start = " + start);
      }

      if (start == null) {
        throw new NoSuchElementException("Invalid route, no start point");
      }

      String toCity = cityMap.get(start);

      while (toCity != null) {
        System.out.println(start + " -> " + toCity + ", ");
        start = toCity;
        toCity = cityMap.get(toCity);
      }
    }

  }


}
