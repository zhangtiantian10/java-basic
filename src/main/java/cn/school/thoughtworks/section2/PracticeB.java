package cn.school.thoughtworks.section2;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> results = new HashMap<>();
        PracticeA practiceA = new PracticeA();

        collection1 = formatCollection(collection1);

        for (String str : collection1) {
            results.put(str, practiceA.countElementsInMap(results, str));
        }

        return results;
    }

    List<String> formatCollection(List<String> collection) {
        List<String> results = new ArrayList<>();

        for (String string : collection) {
            if (string.length() > 1) {
                String splitStr = String.valueOf(string.charAt(1));
                if (splitStr.equals("[")) {
                    splitStr = "\\[";
                }
                String[] array = string.split(splitStr);
                int number = formatNumber(array[1]);
                int i = 0;
                while (i < number) {
                    results.add(array[0]);
                    i ++;
                }
            } else {
                results.add(string);
            }
        }

        return results;
    }

    int formatNumber(String string) {
        String number = "";
        for (String s : string.split("")) {
            if (!StringUtils.isNumeric(s)) {
                break;
            }

            number += s;
        }

        return Integer.parseInt(number);
    }
}
