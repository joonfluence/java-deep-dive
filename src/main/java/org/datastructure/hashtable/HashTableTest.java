package org.datastructure.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void putAndGet(){
        HashTable hashTable = new HashTable(4);
        hashTable.put("john", "john is an actor");
        hashTable.put("lisa", "lisa is a model");
        hashTable.put("sandra", "sandra is a programmer");
        Assertions.assertEquals("john is an actor", hashTable.get("john"));
        Assertions.assertEquals("lisa is a model", hashTable.get("lisa"));
        Assertions.assertEquals("sandra is a programmer", hashTable.get("sandra"));
    }
}
