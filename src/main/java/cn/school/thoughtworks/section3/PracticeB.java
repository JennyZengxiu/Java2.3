package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String temp :object.get("value")){
            Integer count = collectionA.get(temp);
            Integer n = count / 3;
            collectionA.put(temp, count - n);
        }
        return collectionA;
    }
}
