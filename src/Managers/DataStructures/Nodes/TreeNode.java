//Used for BinaryTree only
package Managers.DataStructures.Nodes;

public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>>{
    private TreeNode<T> left, right;
    T data;
    int duplicates;

    public TreeNode(){//default constructor
        this.left = null;
        this.right = null;
        this.data = null;
        duplicates = 0;
    }
    public TreeNode(T data){//parameterized constructor
        this.left = null;
        this.right = null;
        this.data = data;
        duplicates = 0;
    }

    //setters
    public void setLeft(TreeNode<T> left){this.left = left;}
    public void setRight(TreeNode<T> right){this.right = right;}
    public void setData(T data){this.data = data;}
    public void setDuplicates(int duplicates){this.duplicates = duplicates;}
    //getters
    public TreeNode<T> getLeft(){return this.left;}
    public TreeNode<T> getRight(){return this.right;}
    public T getData(){return this.data;}
    public int getDuplicates(){return this.duplicates;}

    //other methods
    public void incrementDuplicates(){
        this.duplicates++;
    }
    public void decrementDuplicates(){
        this.duplicates--;
    }

    @Override
    public int compareTo(TreeNode<T> other){
        return data.compareTo(other.getData());
    }

}
