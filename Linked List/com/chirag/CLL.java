package com.chirag;

public class CLL {
    Node head;
    Node last;

    Node head1, head2;

    public class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
        }
    }

    public void insertInEmpty(int d){
        Node node = new Node(d);
        if(last==null){
            head = last = node;
            last.next = head;
        }
        else{
            System.out.println("List is not empty");
        }
    }

    public void insertAtBeginning(int d){
        Node new_node = new Node(d);

        if(last == null){
            insertInEmpty(d);
        }
        else{
            new_node.next = last.next;
            last.next = new_node;
        }
    }

    public void split(){
        if(head==null) return;

        Node slow = head;
        Node fast = head;

        while(fast.next!=head && fast.next.next!=head){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next.next==head){
            fast = fast.next;
        }

        head1 = head;

        if(head.next!=head){
            head2 = slow.next;
        }

        fast.next = slow.next;
        slow.next = head;
    }

    public void display(){
        head = last.next;
        Node temp = head;

        if(head!=null){
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp!=head);
        }
    }

    void printList(Node node)
    {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        // Node one = cll.new Node(3);
        // Node two = cll.new Node(5);
        // Node three = cll.new Node(9);

        // one.next = two;
        // two.next = three;
        // three.next = one;

        cll.insertInEmpty(10);
        cll.insertAtBeginning(20);
        cll.insertAtBeginning(30);
        cll.insertAtBeginning(40);
        cll.display();
    }
}
