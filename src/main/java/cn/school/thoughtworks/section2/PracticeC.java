package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> results = new HashMap<>();
        PracticeA practiceA = new PracticeA();
        PracticeB practiceB = new PracticeB();

        collection1 = practiceB.formatCollection(collection1);

        for (String str : collection1) {
            results.put(str, practiceA.countElementsInMap(results, str));
        }

        return results;
    }
}
