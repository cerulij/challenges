import java.util.ArrayList;
import java.util.List;

public class Factos {

  public static List<Long> maxSubsetSum(List<Integer> k) {

    List<Long> result = new ArrayList<>();
    long count = 0;

    for (Integer num : k) {
      for (int i = 1; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          if (num / i == i) {
            count += i;
          } else {
            count += i;
            count += num / i;
          }
        }
      }
      result.add(count);
      count = 0;
    }

    return result;
  }


  public static List<Integer> solve(int X, List<Integer> arr, List<Integer> query_values) {
    List<Integer> result = new ArrayList<>();

    int count = 0;
    for (Integer q : query_values) {

      for (int i = 0; i < arr.size(); i++) {
        if (X == arr.get(i)) {
          count++;
          if (count == q) {
            result.add(i + 1);
            count = 0;
            break;
          }
        }

        if (i == arr.size() - 1) {
          result.add(-1);
          count = 0;
        }
      }
    }

    return result;
  }


  public static void main (String[] args) {
    List<Integer> arr = new ArrayList<>();
    List<Integer> query_values = new ArrayList<>();
    List<Integer> res = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(20);
    arr.add(8);
    arr.add(8);
    arr.add(1);
    arr.add(2);
    arr.add(5);
    arr.add(8);
    arr.add(0);

//    query_values.add(100);
//    query_values.add(4);
    query_values.add(3);

    res = solve(8, arr, query_values);

    for (Integer num : res) {
      System.out.println(num);
    }

  }



}
