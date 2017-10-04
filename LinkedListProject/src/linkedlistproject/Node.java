/*
    Authors: Jamie & Nate
    Date: 10 / 4 / 2017
 */
package linkedlistproject;

public class Node {
    public Node next, previous;
    public String value;
    public Node(String a) {
        value = a;
    }
    public Node(String a, Node n) {
        value = a;
        next = n;
    }
}
