package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for (String temp:collectionA) {
            Integer count = collection3.get(temp);
            if (temp.length() == 1) {
                collection3.put(temp, (count == null) ? 1 : count + 1);
            }
            else{
                String [] str = temp.split("-");
                collection3.put(str[0], Integer.parseInt(str[1]));
            }
        }
        for (String temp :object.get("value")){
            Integer count = collection3.get(temp);
            Integer n = count / 3;
            collection3.put(temp, count - n);
        }
        return collection3;
    }
}
