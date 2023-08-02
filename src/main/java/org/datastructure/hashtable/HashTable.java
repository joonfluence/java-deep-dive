package org.datastructure.hashtable;

import java.util.LinkedList;

class HashTable {
    LinkedList<Node>[] data;
    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key){
        return key.chars().sum();
    }

    int convertToIndex(int hashCode){
        return hashCode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key){
        if (list == null) return null;
        for (Node node : list){
            if(node.getKey().equals(key)){
                return node;
            }
        }
        return null;
    }

    void put(String key, String value){
        int hashCode = getHashCode(key);
        int idx = convertToIndex(hashCode);
        LinkedList<Node> list = data[idx];
        if (list == null) {
            list = new LinkedList<Node>();
            data[idx] = list;
        }

        Node node = searchKey(list, key);
        if (node == null){
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    String get(String key){
        int hashCode = getHashCode(key);
        int idx = convertToIndex(hashCode);
        LinkedList<Node> list = data[idx];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }
}