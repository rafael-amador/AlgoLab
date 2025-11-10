//Used fo BinaryTree only
package Managers.DataStructures.Nodes;

public class TreeNode<T> {
    private TreeNode<T> left, right;

    //setters
    public void setLeft(TreeNode<T> left){this.left = left;}
    public void setRight(TreeNode<T> right){this.right = right;}
    //getters
    public TreeNode<T> getLeft(){return this.left;}
    public TreeNode<T> getRight(){return this.right;}
}
