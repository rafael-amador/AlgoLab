//used for LinkedList, Queue, and Stack
package Managers.DataStructures.Nodes;

public class SingleLinkedNode<T extends Comparable<T>> {
    private SingleLinkedNode<T> next;
    T data;

    public SingleLinkedNode(){//default constructor
        this.next = null;
        this.data = null;
    }
    public SingleLinkedNode(T data){//parameterized constructor
        this.next = null;
        this.data = data;
    }
    public SingleLinkedNode(T data, SingleLinkedNode<T> next){//parameterized constructor
        this.next = next;
        this.data = data;
    }

    //setters
    public void setNext(SingleLinkedNode<T> next){this.next = next;}
    public void setData(T data){this.data = data;}
    //getters
    public SingleLinkedNode<T> getNext(){return this.next;}
    public T getData(){return this.data;}
}
