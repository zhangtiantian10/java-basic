package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> results = new ArrayList<>();

        for (String str : collection1) {
            if (includeElement(collection2, str)) {
                results.add(str);
            }
        }

        return results;
    }

    Boolean includeElement(List<String> collection, String element) {
        for (String str : collection) {
            if (element.equals(str)) {
                return true;
            }
        }

        return false;
    }
}
