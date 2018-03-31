package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> results = new HashMap<>();

        for (String str : collection1) {
            results.put(str, countElementsInMap(results, str));
        }

        return results;
    }

    int countElementsInMap(Map<String, Integer> collection, String element) {
        int count = 0;

        if (collection.get(element) == null) {
            count = 1;
        } else {
            count = collection.get(element) + 1;
        }

        return count;
    }
}
