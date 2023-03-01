package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "bhavik");
        map.put(2, "jaimin");
        map.put(3, "hitesh");
        map.put(4, "ronak");

        Set entrySet = map.entrySet();

        Iterator itr = entrySet.iterator();

        while (itr.hasNext()) {
            //System.out.println(itr.next());

            Map.Entry mapEntry = (Map.Entry) itr.next();
            //System.out.println(mapEntry.getKey()+" , "+mapEntry.getValue());
            System.out.println(mapEntry.getValue());//+" , "+mapEntry.getValue());
        }
        System.out.println("===========================without iterator=================");
        for (Map.Entry object : map.entrySet()) {
            //System.out.println(object);
            //Map.Entry mapEntry = (Map.Entry) object;
            System.out.println(object.getKey() + " , " + object.getValue());
        }

        System.out.println("===========================without for loop=================");

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " , " + x.getValue()));

        System.out.println("===========================using stream=================");


        map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);
        //Optional<Boolean> mapEntry1 = map.entrySet().stream().map(x -> x.getValue().equals("jaimin")).findFirst();
        //System.out.println(mapEntry1.get());
    }
}
