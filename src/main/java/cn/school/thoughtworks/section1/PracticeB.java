package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> results = new ArrayList<>();
        PracticeA practiceA = new PracticeA();

        for (String str : collection1) {
            for (List<String> list : collection2) {
                if (practiceA.includeElement(list, str)) {
                    results.add(str);
                    break;
                }
            }
        }

        return results;
    }
}
