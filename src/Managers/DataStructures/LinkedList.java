package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class LinkedList<T> {
    private SingleLinkedNode<T> head, tail;

    public LinkedList(){//default constructor
        this.head = null;
        this.tail = null;
        System.out.println("LinkedList() was created.");
    }
    public LinkedList(SingleLinkedNode<T> head){//parameterized constructor
        this.head = head; 
        this.tail = head; 
        System.out.println("LinkedList(head) was created.");
    }
    public LinkedList(SingleLinkedNode<T> head, SingleLinkedNode<T> tail){//parameterized constructor
        this.head = head; 
        this.tail = tail; 
        System.out.println("LinkedList(head, tail) was created.");
    }

}
