package com.yash.ftp.solutions.probSolving;

public class Reverse_LinkedList {
	 
    static Nodex head;
 
    static class Nodex {
 
        int data;
        Nodex next;
 
        Nodex(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Nodex reverse(Nodex node)
    {
        Nodex prev = null;
        Nodex current = node;
        Nodex next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(Nodex node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Nodex(85);
        list.head.next = new Nodex(15);
        list.head.next.next = new Nodex(4);
        list.head.next.next.next = new Nodex(20);
 
        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
public class Reverse_LinkedList {

}
