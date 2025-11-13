package Managers.DataStructures;
import Managers.DataStructures.DisplayMethods.TreePrettyPrinter;
import Managers.DataStructures.Nodes.TreeNode;
import java.util.Scanner;
public class BinaryTree<T extends Comparable<T>>{
    private TreeNode<T> root;

    public BinaryTree(){//default constructor
        this.root = null;
        System.out.println("BinaryTree() was created.");
    }

    public void insertNode(T element){
       
    }
    public void insertNodeRec(T element,TreeNode<T> cur){
        
    }
    public T removeElement(T element) { 
        return element;
    }

    public void displayTree() {
        
    }

    public void diplayInOrder(){
        
    }
    public boolean isEmpty(){
        return false;
    }
}
