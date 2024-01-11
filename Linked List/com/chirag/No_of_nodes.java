package com.chirag;

import com.chirag.LinkedList.Node;

public class No_of_nodes {

    Node head;
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(10);
        l.push(20);
        l.push(30);
        l.display();
    
        System.out.println(l.count());
        System.out.println(l.recursive_count());
    }

    // public int count(){
    //     int count = 0;
    //     Node temp = head;
    //     while(temp!=null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     return count;
    // }

    // public int get_count(Node head){
    //     if(head == null){
    //         return 0;
    //     }

    //     return 1 + get_count(head.next);
    // }

    // public int recursive_count(){
    //     return get_count(head);
    // }
}
