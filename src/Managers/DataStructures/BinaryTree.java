package Managers.DataStructures;
import Managers.DataStructures.Nodes.TreeNode;

public class BinaryTree<T extends Comparable<T>>{
    private TreeNode<T> root;

    public BinaryTree(){//default constructor
        this.root = null;
        System.out.println("BinaryTree() was created.");
    }
    public BinaryTree(TreeNode<T> root){//parametized constructor
        this.root = root;
        System.out.println("BinaryTree(root) was created.");
    }

    public void insertElement(){

    }
    public void removeElement(){

    }
    public void displayTree(){ //visual representation of binary tree using / and \ 

    }
}
