package com.gevkurg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DiffK2 {
  public static int diffPossible(final List<Integer> a, int b) {
    if (a == null || a.size() == 0) {
      return 0;
    }

    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < a.size(); ++i) {
      if (map.containsKey(a.get(i)) && map.get(a.get(i)) != i) {
        return 1;
      }

      map.put(a.get(i) + b, i);
      map.put(a.get(i) - b, i);
    }

    return 0;
  }
}
