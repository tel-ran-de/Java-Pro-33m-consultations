import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[][] twoDArray = {{2, 20, 5, 11, -7}, {6, 2, -9, 76, 2}};

    insertSort(twoDArray[0]);
    insertSort(twoDArray[1]);
//    Arrays.sort(twoDArray[0]);

//    Arrays.equals();
//    Arrays.deepEquals();

    final int[] sorted = sort(twoDArray[0], twoDArray[1]);

    Arrays.binarySearch(sorted, 10);


    System.out.println(binarySearch(sorted, -8, 0, 9));
//
//    for (int i = 0; i < twoDArray.length; i++) {
//      for (int j = 0; j < twoDArray[i].length; j++) {
//        System.out.println(twoDArray[i][j]);
//      }
//    }

    System.out.println(Arrays.toString(sort(twoDArray[0], twoDArray[1])));


//    int[][] twoDArray = {{2, 20, 5, 11, -7}, {6, 2, -9, 76, 2}, {1,2,3}};
//    System.out.println(twoDArray.length);
//    int[][] twoDArrayClone = new int[twoDArray[0].length][twoDArray[1].length];
//    int[][] twoDArrayClone = new int[twoDArray[0].length][twoDArray[1].length];
//    int[][] twoDArrayClone = new int[twoDArray[0].length][twoDArray[1].length];
//    int[][] twoDArrayClone = new int[2][twoDArray[1].length];
//    int[][] twoDArrayClone = new int[2][5];

//    System.out.println(twoDArray.length);

//    System.arraycopy(twoDArray, 0, twoDArrayClone, 0, twoDArray.length);

//    System.out.println(twoDArrayClone.length);
//    System.out.println(twoDArrayClone[0].length);
//    System.out.println(twoDArrayClone[1].length);


//    for (int i = 0; i < twoDArrayClone.length; i++){
//      for(int j = 0; j < twoDArrayClone[i].length; j++) {
//        twoDArrayClone[i][j] = twoDArray[i][j];
//      }
//    }

//    for (int i = 0; i < twoDArrayClone.length; i++) {
//      twoDArrayClone[i] = Arrays.copyOf(twoDArray[i], twoDArray[i].length);
//    }
//


//    final int[][] twoDArrayClone1 = Arrays.copyOf(twoDArray, twoDArray.length);
//    final int[][] twoDArrayClone2 = Arrays.copyOfRange(twoDArrayClone, 1, 2);
//    final int[][] twoDArrayClone3 = twoDArray.clone();

//    System.out.println(Arrays.toString(twoDArrayClone.length));
//    System.out.println(twoDArrayClone.length);
//    System.out.println(Arrays.toString(twoDArrayClone1));
//    System.out.println(Arrays.toString(twoDArrayClone2));
//    System.out.println(Arrays.toString(twoDArrayClone3));
//    System.out.println(Arrays.toString(twoDArray));
//    System.out.println(Arrays.toString(twoDArrayClone));


  }


  public static int[] insertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j;
      for (j = i; j > 0 && temp < arr[j - 1]; j--) {
        arr[j] = arr[j - 1];
      }
      arr[j] = temp;
    }
    return arr;
  }

  public static int[] sort(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];

    int i = 0;
    int j = 0;

    for (int k = 0; k < arr.length; k++) {
      if (i > arr1.length - 1) {
        arr[k] = arr2[j];
        j++;
      } else if (j > arr1.length - 1) {
        arr[k] = arr1[i];
        i++;
      } else if (arr1[i] < arr2[j]) {
        arr[k] = arr1[i];
        i++;
      } else {
        arr[k] = arr2[j];
        j++;
      }
    }
    return arr;
  }

  public static int binarySearch(int[] arr, int key, int low, int high) {
    while (low <= high) {
      int mid = low + ((high - low) / 2);
      if (arr[mid] < key) {
        low = mid + 1;
      } else if (arr[mid] > key) {
        high = mid - 1;
      } else if (arr[mid] == key) {
        return mid;
      }

    }
    return -1;
  }

}

