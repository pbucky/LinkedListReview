/*
    Authors: Jamie & Nate
    Date: 10 / 4 / 2017
 */
package linkedlistproject;

public class LinkedListProject {
    public Node head;
    public LinkedListProject(Node a) {
        head = a;
    }
    public void addFirst(String value) {
        // adding a change
    }
    public int getLength() {
        if (head == null) {
            return 0;
        }
        int result = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            result += 1;
        }
        return result;
    }
    public void addLast(String value) {
        if (head == null || getLength() == 0) {
            addFirst(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);
        temp.next.previous = temp;
    }
    public String getLast() {
        if (head == null || getLength() == 0) {
            return "There is nothing in the list.";
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.value;
    }
    public Boolean contains(String value) {
        if (head == null || getLength() == 0) {
            return false;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void listAllNodes() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("Node: " + temp.value + " has ");
            if (temp.next != null && temp.previous != null) {
                System.out.println("a next Node of: " + temp.next.value + ", and a previous Node of: " + temp.previous.value);
            } else if (temp.next != null) {
                System.out.println("a next Node of: " + temp.next.value + ", and has no previous Node.");
            } else if (temp.previous != null) {
                System.out.println("no next Node, and a previous Node of: " + temp.previous.value);
            } else {
                System.out.println("no next Node, or previous Node.");
            }
            temp = temp.next;
        }
    }
}
