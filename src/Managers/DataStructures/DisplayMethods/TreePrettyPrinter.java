package Managers.DataStructures.DisplayMethods; 
import Managers.DataStructures.Nodes.*;

public final class TreePrettyPrinter<T extends Comparable<T>> {
    private final TreeNode<T> root; 
    private final int stringSize; // if < 1, auto width

    public TreePrettyPrinter() {
        this.root = null; 
        this.stringSize = -1; 
    } 
    public TreePrettyPrinter(TreeNode<T> root) {
        this.root = root; 
        this.stringSize = -1; 
    } public TreePrettyPrinter(TreeNode<T> root, int stringSize) {
        this.root = root; 
        this.stringSize = stringSize; 
    }

    public void printInOrder(){
        System.out.println("Binary Tree in order: ");
        String inOrder = printInOrderRec(root, "");
        if (!inOrder.isEmpty()) {
            inOrder = inOrder.substring(0, inOrder.length() - 2);
        }
        System.out.println(inOrder);
    }
    public String printInOrderRec(TreeNode<T> cur, String inOrder){
        if (cur == null) return inOrder; // base case
        inOrder = printInOrderRec(cur.getLeft(), inOrder);
        inOrder += cur.getData() + ", ";
        inOrder = printInOrderRec(cur.getRight(), inOrder);

        return inOrder;
    }
    public void printPostOrder(){
        System.out.println("Binary Tree in post-order: ");
        String postOrder = printPostOrderRec(root, "");
        if (!postOrder.isEmpty()) {
            postOrder = postOrder.substring(0, postOrder.length() - 2);
        }
        System.out.println(postOrder);
    }
    public String printPostOrderRec(TreeNode<T> cur, String postOrder){
        if (cur == null) return postOrder; // base case
        postOrder = printPostOrderRec(cur.getLeft(), postOrder);
        postOrder = printPostOrderRec(cur.getRight(), postOrder);
        postOrder += cur.getData() + ", ";

        return postOrder;
    }
    public void printPreOrder(){
        System.out.println("Binary Tree in pre-order: ");
        String preOrder = printPreOrderRec(root, "");
        if (!preOrder.isEmpty()) {
            preOrder = preOrder.substring(0, preOrder.length() - 2);
        }
        System.out.println(preOrder);
    }
    public String printPreOrderRec(TreeNode<T> cur, String preOrder){
        if (cur == null) return preOrder; // base case
        preOrder += cur.getData() + ", ";
        preOrder = printPreOrderRec(cur.getLeft(), preOrder);
        preOrder = printPreOrderRec(cur.getRight(), preOrder);

        return preOrder;
    }
}