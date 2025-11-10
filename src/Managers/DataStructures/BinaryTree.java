package Managers.DataStructures;
import Managers.DataStructures.Nodes.TreeNode;

public class BinaryTree<T> {
    private TreeNode<T> root;

    public BinaryTree(){//default constructor
        this.root = null;
    }
    public BinaryTree(TreeNode<T> root){//parametized constructor
        this.root = root;
    }
}
