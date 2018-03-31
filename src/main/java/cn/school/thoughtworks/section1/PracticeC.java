package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> results = new ArrayList<>();
        PracticeA practiceA = new PracticeA();

        for (String str : collection1) {
            if (practiceA.includeElement(collection2.get("value"), str)) {
                results.add(str);
            }
        }

        return results;
    }
}
