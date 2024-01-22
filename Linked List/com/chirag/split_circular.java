package com.chirag;

import com.chirag.CLL.Node;

public class split_circular {
    Node head;
    Node head1, head2;
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertInEmpty(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
 
        System.out.println(
            "Original Circular Linked list ");
        list.display();
 
        // Split the list
        list.split();
        System.out.println("");
        System.out.println("First Circular List ");
        list.printList(list.head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        list.printList(list.head2);
    }
}
