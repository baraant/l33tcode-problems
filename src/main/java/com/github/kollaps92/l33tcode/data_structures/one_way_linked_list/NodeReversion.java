package com.github.kollaps92.l33tcode.data_structures.one_way_linked_list;

public class NodeReversion {

    // node1 -> node2 -> node3 -> null

    // node3 -> node2 -> node1 -> null

    public Node revertNode(Node node) {
        return revertNode(node, null);
    }

    private Node revertNode(Node node, Node previous) {
        Node newInitialNode;

        if (node.getNext() == null) {
            node.setNext(previous);
            return node;
        }

        newInitialNode = revertNode(node.getNext(), node);
        node.setNext(previous);

        return newInitialNode;
    }
}
