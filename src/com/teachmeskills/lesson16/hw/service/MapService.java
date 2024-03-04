package com.teachmeskills.lesson16.hw.service;

import com.teachmeskills.lesson16.hw.model.client.Client;

import java.util.Iterator;
import java.util.Map;

public class MapService {

    public static void getClientInfoByMapEntry(Map<String, Client> map) {
        System.out.println("******Task # 1******");
        for (Map.Entry<String, Client> entry : map.entrySet()) {
            System.out.println("Client info: ");
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void getClientInfoByIterator(Map<String, Client> map) {
        System.out.println("******Task # 2******");
        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Client info: ");
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void getAllMapKeys(Map<String, Client> map) {
        System.out.println("******Task # 3******");
        System.out.println(map.keySet());
    }

    public static void getAllMapValues(Map<String, Client> map) {
        System.out.println("******Task # 4******");
        System.out.println(map.values());
    }

}
