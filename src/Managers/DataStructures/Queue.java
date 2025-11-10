package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class Queue<T> {
    private SingleLinkedNode<T> front, rear;

    public Queue(){//default constructor
        this.front = null;
        this.rear = null;
        System.out.println("Queue() was created.");
    }
    public Queue(SingleLinkedNode<T> front){//parameterized constructor
        this.front = front;
        this.rear = front;
        System.out.println("Queue(front) was created.");
    }
    public Queue(SingleLinkedNode<T> front, SingleLinkedNode<T> rear){//parameterized constructor
        this.front = front;
        this.rear = rear;
        System.out.println("Queue(front, rear) was created.");
    }
}
