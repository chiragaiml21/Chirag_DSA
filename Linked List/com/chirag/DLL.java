package com.chirag;

public class DLL {
    Node head;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data = d;
        }
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public void push(int d){
        Node new_node = new Node(d);
        
        if(head==null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }

// Insert node after a given node
    public void insert(int index, int d){
        Node new_node = new Node(d);
        Node prev_node = head;

        for(int i=1; i<index; i++){
            prev_node = prev_node.next;
        }
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;
        
        if(new_node.next!=null){
            new_node.next.prev = new_node;
        }
    }

    public void insertLast(int d){
        Node new_node = new Node(d);

        if(head==null){
            head = new_node;
        }
        else{
            Node lastNode = head;

            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = new_node;
            new_node.next = null;
            new_node.prev = lastNode;

        }
    }

    public void delete(int index){
        Node current = head;

        if(index==0){
            head = head.next;
            head.prev = null;
            return;
        }
        
        for(int i=0; i<index; i++){
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev; 
    }

    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.push(10);
        dll.push(20);
        dll.push(30);
        dll.insert(2, 40);
        dll.insertLast(100);
        dll.delete(2);
        dll.display();
    }
}
