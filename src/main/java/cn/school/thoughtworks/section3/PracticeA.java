package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {

        for (String str : object.get("value")) {
            if (collectionA.get(str) != null) {
                collectionA.put(str, collectionA.get(str) - 1);
            }
        }

        return collectionA;
    }
}
