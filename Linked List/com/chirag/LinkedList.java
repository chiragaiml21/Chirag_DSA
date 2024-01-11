package com.chirag;

public class LinkedList {
    Node head;
    int size;

    class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public LinkedList(){
        this.size = 0;
    }


    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

        size++;
    }

    public void insertAfter(Node given_node, int new_data){
        if(given_node == null){
            System.out.println("The node is not found!");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = given_node.next;
        given_node.next = new_node;

        size++;
    }

    public void insert(int index, int new_data){
        if(index==0){
            push(new_data);
        }
        else{
            Node temp = head;
            for(int i=1; i<index; i++){
                temp = temp.next;
            }

            Node new_node = new Node(new_data);
            new_node.next = temp.next;
            temp.next = new_node;
        }
        size++;
        
    }

    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head==null){
            head = new_node;
        }
        else{
            new_node.next = null;

            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;       
        }
        size++;
    }

    public int deleteFirst(){
        Node temp = head;
        head = head.next;

        size--;
        return temp.data;
    }

    public int deleteLast(){
        Node secondLast = get(size-2);
        int val = secondLast.next.data;
        secondLast.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        Node given_node = get(index);
        Node prev_given_node = get(index - 1);
        int val = given_node.data;
        prev_given_node.next = given_node.next;
        size--;

        return val;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int count(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(10);
        l.push(20);
        l.push(30);
        l.display();
        l.insertAfter(l.head, 100);
        l.display();
        l.insert(3, 200);
        l.display();
        l.append(1000);
        l.display();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println(l.deleteLast());
        l.display();
        System.out.println(l.delete(1));
        l.display();
        System.out.println(l.count());
    }

    public int get_count(Node head){
        if(head == null){
            return 0;
        }

        return 1 + get_count(head.next);
    }

    public int recursive_count(){
        return get_count(head);
    }
}
