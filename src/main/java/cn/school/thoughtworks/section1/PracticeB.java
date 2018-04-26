package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>();
        for (String s1 : collection1) {
            for (List<String> i : collection2) {
                for (String s2 : i) {
                    if (s2.equals(s1)) {
                        result.add(s1);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
