//used for LinkedList, Queue, and Stack
package Managers.DataStructures.Nodes;

public class SingleLinkedNode<T> {
    private SingleLinkedNode<T> next;

    //setters
    public void setNext(SingleLinkedNode<T> next){this.next = next;}
    //getters
    public SingleLinkedNode<T> getNext(){return this.next;}
}
