package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class Stack<T> {
    private SingleLinkedNode<T> top;
    
    public Stack(){//default constructor
        this.top = null;
    }public Stack(SingleLinkedNode<T> top){//parameterized constructor
        this.top = top;
    }
}
