package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    private PracticeB practiceB = new PracticeB();
    private PracticeC practiceC = new PracticeC();

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection = formatCollection(collectionA);

        return practiceB.createUpdatedCollection(collection, object);
    }

    Map<String, Integer> formatCollection(List<String> collection) {
        Map<String, Integer> results = new HashMap<>();
        for (String str : collection) {
            int count = 0;
            if (str.length() > 1) {
                String[] array = str.split("-");
                str = array[0];
                count = Integer.parseInt(array[1]);
            }
            results.put(str, practiceC.countElementsInMap(results, str) + count);
        }

        return results;
    }
}
