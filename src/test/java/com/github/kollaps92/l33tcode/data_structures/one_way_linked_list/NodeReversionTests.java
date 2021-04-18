package com.github.kollaps92.l33tcode.data_structures.one_way_linked_list;

import org.junit.jupiter.api.Test;

public class NodeReversionTests {

    @Test
    public void test() {
        NodeReversion rn = new NodeReversion();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.setNext(node2);
        node2.setNext(node3);

        Node resultNode = rn.revertNode(node1);
        System.out.println("Hi");
    }
}
