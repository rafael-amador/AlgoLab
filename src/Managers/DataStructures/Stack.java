package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class Stack<T extends Comparable<T>> {
    private SingleLinkedNode<T> top;
    
    public Stack(){//default constructor
        this.top = null;
        System.out.println("Stack() was created.");
    }
    public Stack(SingleLinkedNode<T> top){//parameterized constructor
        this.top = top;
        System.out.println("Stack(top) was created.");
    }

    public void pushElement(){

    }
    public void popElement(){
        
    }
    public void displayStack(){ 
        
    }
}
