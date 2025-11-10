package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class LinkedList<T> {
    private SingleLinkedNode<T> head, tail;

    public LinkedList(){//default constructor
        this.head = null;
        this.tail = null;
    }
    public LinkedList(SingleLinkedNode<T> head){//parameterized constructor
        this.head = head; 
        this.tail = head; 
    }
    public LinkedList(SingleLinkedNode<T> head, SingleLinkedNode<T> tail){//parameterized constructor
        this.head = head; 
        this.tail = tail; 
    }

}
