import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Первый элемент, встречающийся k раз в массиве

public class FirstElement {

  public static void main(String[] args) {

//    int[] arr = {1, 1, 1, 1, 7, 4, 3, 4, 8, 7, 7, 4, 3, 4, 8, 7, 1, 7, 4, 3, 4, 8, 7, 7, 4, 3, 4, 8, 7, 7, 4, 3, 4, 8, 7, 1, 7, 4, 3, 4, 8, 7, 1, 7, 4, 3, 4, 8, 7, 8};
    int[] arr = {1, 2, 44, 2, 7, 6, 44};

//    System.out.println(firstElement(arr, 7));
    System.out.println(firstElementNew(arr, 2));

  }

  public static int firstElement(int[] arr, int k) {
    Set<Integer> notCount = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      if (!notCount.contains(arr[i])) {
        for (int j = i; j < arr.length; j++) {
          if (arr[i] == arr[j]) {
            count++;
          }
        }
        if (count == k) {
          return arr[i];
        }
        notCount.add(arr[i]);
      }
    }
    return -1;
  }

  public static int firstElementNew(int[] arr, int k) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (int j : arr) {
      final int count = 0;

//      map.computeIfPresent(j, (key, oldValue) -> oldValue + 1);
//      map.computeIfAbsent(j, integer -> {
//        System.out.println("Hi");
//        return count + 1;});


      map.compute(j, (key, oldValue) -> oldValue == null ? count + 1 : oldValue + 1);


//      if (map.containsKey(j)) {
//        count = map.get(j);
//      }
//      map.put(j, count + 1);
//    }

//    for (int j : arr) {
//      if (map.get(j) == k) {
//        return j;
//      }
    }
    map.entrySet().stream().filter(integerIntegerEntry ->
      integerIntegerEntry.getValue().equals(k)).findFirst().get();

    return -1;
  }
}
