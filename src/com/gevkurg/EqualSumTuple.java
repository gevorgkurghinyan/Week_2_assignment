package com.gevkurg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EqualSumTuple {
  public static ArrayList<Integer> equal(ArrayList<Integer> a) {
    ArrayList<Integer> result = new ArrayList<>();
    if (a == null || a.size() == 0) {
      return result;
    }

    Map<Integer, Tuple> map = new HashMap<>();
    for(int i = 0; i < a.size(); ++i) {
      for(int j = i + 1; j < a.size(); ++j) {
        int sum = a.get(i) + a.get(j);

        if (map.containsKey(sum)) {
          Tuple t = map.get(sum);
          if (t.i != i && t.i != j && t.j != j && t.j != i) {
            ArrayList<Integer> array = new ArrayList<>();
            setValues(array, t, i, j);
            if (result.size() == 0) {
              result = array;
            } else  {
              for (int k = 0; k < 4; ++k) {
                if (result.get(k) < array.get(k)) {
                  break;
                } else if (array.get(k) < result.get(k)) {
                  replace (result, array);
                }
              }
            }
          }
        } else {
          map.put(sum, new Tuple(i, j));
        }
      }
    }

    return result;
  }

  private  static void replace(ArrayList<Integer> array1, ArrayList<Integer> array2) {
    for (int i = 0; i < array1.size(); ++i) {
      array1.set(i, array2.get(i));
    }
  }

  private static void setValues(ArrayList<Integer> array, Tuple t, int i, int j){
    array.add(t.i);
    array.add(t.j);
    array.add(i);
    array.add(j);
  }

  private static class Tuple {
    private int i;
    private int j;

    Tuple (int i, int j) {
      this.i = i;
      this.j = j;
    }
  }
}
