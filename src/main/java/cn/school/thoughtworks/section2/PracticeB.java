package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String temp:collection1) {
            Integer count = result.get(temp);
            if (temp.length() == 1) {
                result.put(temp, (count == null) ? 1 : count + 1);
            }
            else{
                String [] str = temp.split("-");
                result.put(str[0], Integer.parseInt(str[1]));
            }
        }
        return result;
    }
}
