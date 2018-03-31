package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String str : object.get("value")) {
            if (collectionA.get(str) != null) {
                int count = collectionA.get(str);
                count = count - Integer.valueOf(count / 3);

                collectionA.put(str, count);
            }
        }

        return collectionA;
    }
}
