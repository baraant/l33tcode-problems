package com.github.baraant.l33tcode.data_structures.one_way_linked_list;

public class Node {

    private Node next;
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

