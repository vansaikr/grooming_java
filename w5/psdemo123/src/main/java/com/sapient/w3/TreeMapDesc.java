package com.sapient.w3;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDesc {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>(Collections.reverseOrder());

        map.put("1", "rps");
        map.put("2", "csk");
        map.put("3", "srh");

        map.forEach((k,v)->{System.out.println(k+" : "+v);});
    }
}
