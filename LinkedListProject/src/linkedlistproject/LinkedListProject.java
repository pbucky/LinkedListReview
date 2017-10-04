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
        Node temp = head;
        while ()
    }
}
