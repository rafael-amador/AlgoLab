//Used for BinaryTree only
package Managers.DataStructures.Nodes;

import java.util.ArrayList;

public class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> left, right;
    T data;

    public TreeNode(){//default constructor
        this.left = null;
        this.right = null;
        this.data = null;
    }
    public TreeNode(T data){//parameterized constructor
        this.left = null;
        this.right = null;
        this.data = data;
    }
    public TreeNode(T data, TreeNode<T> left){//parameterized constructor
        this.left = left;
        this.right = null;
        this.data = data;
    }
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right){//parameterized constructor
        this.left = left;
        this.right = right;
        this.data = data;
    }

    //setters
    public void setLeft(TreeNode<T> left){this.left = left;}
    public void setRight(TreeNode<T> right){this.right = right;}
    public void setData(T data){this.data = data;}
    //getters
    public TreeNode<T> getLeft(){return this.left;}
    public TreeNode<T> getRight(){return this.right;}
    public T getData(){return this.data;}

}
