package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class Queue<T> {
    private SingleLinkedNode<T> front, rear;

    public Queue(){//default constructor
        this.front = null;
        this.rear = null;
    }
    public Queue(SingleLinkedNode<T> front){//parameterized constructor
        this.front = front;
        this.rear = front;
    }
    public Queue(SingleLinkedNode<T> front, SingleLinkedNode<T> rear){//parameterized constructor
        this.front = front;
        this.rear = rear;
    }
}
