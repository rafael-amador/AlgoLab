package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class Stack<T> {
    private SingleLinkedNode<T> top;
    
    public Stack(){//default constructor
        this.top = null;
        System.out.println("Stack() was created.");
    }
    public Stack(SingleLinkedNode<T> top){//parameterized constructor
        this.top = top;
        System.out.println("Stack(top) was created.");
    }
}
