/*
    Authors: Jamie & Nate
    Date: 10 / 4 / 2017
 */
package linkedlistproject;

public class LinkedListProject {
    Node head;
    public LinkedListProject(Node a) {
        head = a;
    }
    public void addFirst(String value) {
        if (head == null) {
            head = new Node(value);
        }
        else {
            Node oldHead = head;
            head = new Node(value);
            head.next = oldHead;
            head.next.previous = head;
        }
    }
    public String getFirst() {
        return head.value;
    }
    public String get(int x) {
        Node n = head;
        for (int i = 0; i <= x; x++) {
            if (i == x && n != null) {
                return n.value;
            }
            n = n.next;
        }
         return "There is no node at index: " + x;
    }
    public String toString() {
        String returnString = "{";
        Node n = head;
        for (int i = 0; i < getLength(); i++) {
            returnString += n.value;
        }
        returnString += "}";
        return returnString;
    }
    public void insertAt(int i, String v) {
        Node n = null;
        Node h = head;
        //getlength
        if ( i == 0) {
            addFirst(v);
            return;
        }
        else if (i >= getLength()) {
            addLast(v);
            return;
        }
        else {
          n = getNode(i - 1);
        }

            n.next = new Node(v, n.next);
            n.next.previous = n;
            n.next.next.previous = n.next;
        
    }
       public void insertAt(int i, Node v) {
        Node n = null;
        Node h = head;
        //getlength
        if ( i == 0) {
            addFirst(v.identity);
            return;
        }
        else if (i >= getLength()) {
            addLast(v.identity);
            return;
        }
        else {
          n = getNode(i - 1);   
        }

            n.next = new Node(v.identity, n.next);
            n.next.previous = n;
            n.next.next.previous = n.next;
        
    }
    
      public void insertBefore(String target, String value) {
        if (!(contains(target))) {
            addLast(value);
        }
        else {
            Node n = head;
            int x = 0;
            while (n != null) {
                if (n.identity.equals(target)) {
                    insertAt(x, value);
                    return;
                }
                x++;
                n = n.next;
                
            }
        }
    }
      public Node remove(int i) {
          Node n= null;
          if (i == 0) {
              head = head.next;
              if (head.previous != null) {
              head.previous = null;
              }
          }
          else if (i >= getLength()) {
              return null;
          }
          else if (i==getLength() - 1) {
              n = getNode(i);
              n.previous.next = null;
          }
          else {
          n = getNode(i);
          n.previous.next = n.next;
          n.next.previous = n.previous;
          
          }
          return n;
      }
      public void swap(int i, int y) {
          Node a = getNode(i);
          Node b = getNode(y);
          if (i > y) {
              remove(i);
               insertAt(i - 1, b);
              remove(y);
             
              insertAt(y, a);
          }
          else if (y > i) {
              remove(y);
              insertAt(y - 1, a);
              remove(i);
              
              insertAt(i, b);
             
          }
          else if ( i == y) {
              
          }
         
      }
      public void sort()
      {
          boolean unsorted = true;
          
          while (unsorted) {
              boolean checker = true;
              for (int i = 0; i < getLength() - 1; i++) {
                  if (((getNode(i).compareTo(getNode(i + 1)))) > 0) {
                      checker = false;
                  }
              }
              if (checker) {
                  unsorted = false;
              }
              for (int i = 0; i < getLength() - 1; i++) {
                  if (((getNode(i).compareTo(getNode(i + 1)))) > 0) {
                      swap(i,i+1);
                }
              }
              
          }
      }    
    
}
