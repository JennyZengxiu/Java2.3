package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>();
        for (String s1:collection1){
            if(collection2.contains(s1)) {
                result.add(s1);
            }
        }
        return result;
    }
}
