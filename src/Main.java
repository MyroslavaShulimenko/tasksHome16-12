import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Есть массив положительных целых чисел.  Найти элемент (если он есть), который  встречается в массиве >length/2 (доминантный элемент). В противном случае //вернуть -1
Integer[] arr={2,3,3,3,4,4,4,3,1,4,3,3,3,3};
        System.out.println(arrInteger(arr,4));
        //System.out.println(arrInteger1(arr,4));
        System.out.println(arrInteger(arr));

    }
    public static int  arrInteger (Integer[]arr, Integer element) {
        Map<Integer,Integer> newArrInt=new HashMap<>();
        for (Integer numb:arr) {
            if (newArrInt.containsKey(numb)) newArrInt.put(numb,newArrInt.get(numb)+1);
            else newArrInt.put(numb,1);
        }
        return newArrInt.containsKey(element)&& newArrInt.get(element)>arr.length/2?newArrInt.get(element):-1;
    }
  /*  public static int  arrInteger1 (Integer[]arr, Integer element) {
        Map<Integer,Integer> newArrInt=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
               newArrInt.compute(element, (k, v) -> (v == null) ? 1 : v + 1);
            }
        System.out.println(Arrays.toString(new Map[]{newArrInt}));
        return newArrInt.containsKey(element)&& newArrInt.get(element)>arr.length/2?newArrInt.get(element):-1;
        }*/
  public static int arrInteger(Integer[] arr) {
      Map<Integer, Integer> map = new HashMap<>();

      for (int i : arr) {
          Integer v = map.merge(i, 1, Integer::sum);
          if (v > arr.length / 2) {
              return i;
          }
      }

      return -1;
  }
        }

