package org.datastructure.hashtable;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    @Test
    public void putAndGet(){
        Hashtable nodeHashtable = new Hashtable<>();
        System.out.println("nodeHashtable = " + nodeHashtable);

        HashMap<Object, Object> hashMap = new HashMap<>();
        System.out.println("hashMap = " + hashMap);

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        System.out.println("concurrentHashMap = " + concurrentHashMap);
    }
}
