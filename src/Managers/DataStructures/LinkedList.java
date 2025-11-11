package Managers.DataStructures;
import Managers.DataStructures.Nodes.SingleLinkedNode;

public class LinkedList<T extends Comparable<T>> {
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
    public void insertNode(T element){
        SingleLinkedNode<T> insertNode = new SingleLinkedNode<>(element);
        if (head == null){
            head = insertNode;
            tail = insertNode;
            return;
        }
        SingleLinkedNode<T> cur = head;
        while (cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(insertNode); //insert Node at the end
        tail = insertNode;
    }
    public T removeElement(T element){
        if (head == null){ //empty list
            return null; 
        }
        if(head.getData().equals(element)){ //if head is getting removed update head
            SingleLinkedNode<T> removedNode = head;
            head = head.getNext();
            if (head == null){ //list became empty
                tail = null; 
            }

            removedNode.setNext(null); // clean up pointer of deleted node
            return removedNode.getData();
        }
        SingleLinkedNode<T> cur = head;
        while (cur.getNext() != null){
            if (cur.getNext().getData().equals(element)){ //if the next node with the same element was found
                //remove node
                SingleLinkedNode<T> removedNode = cur.getNext();
                cur.setNext(cur.getNext().getNext());
                if (cur.getNext() == null){ //update tail if cur node points to the end
                    tail = cur;
                }
                removedNode.setNext(null); // clean up pointer of deleted node
                return removedNode.getData();

            }
            cur = cur.getNext();
        }
        return null; //if no node was found with the same element retur null
    }
    public void displayList(){
        if (head == null) {
            System.out.println("No elements have been added to Linked List yet.");
            return;
        }

        System.out.println("Current Elements: ");
        System.out.print("Printed Linked List: ");

        SingleLinkedNode<T> cur = head;
        while(cur != null){
            System.out.print(cur.getData());
            if (cur != tail){ //print -> for all exept the tail
                System.out.print(" -> ");
            }
            cur = cur.getNext();
        }
        System.out.println();
    }
}
