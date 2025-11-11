//Used for Graph only
package Managers.DataStructures.Nodes;

import java.util.ArrayList;

public class GraphNode<T extends Comparable<T>> {
    private ArrayList<GraphNode<T>> neighbors;
    T data;

    public GraphNode(){//default constructor
        this.neighbors = null;
        this.data = null;
    }
    public GraphNode(T data){//parameterized constructor
        this.neighbors = null;
        this.data = data;
    }
    public GraphNode(T data, ArrayList<GraphNode<T>> neighbors){//parameterized constructor
        this.neighbors = neighbors;
        this.data = data;
    }

    //setters
    public void setNeighbors(ArrayList<GraphNode<T>> neighbors){this.neighbors = neighbors;}
    public void setData(T data){this.data = data;}
    //getters
    public ArrayList<GraphNode<T>> getNeighbors(){return this.neighbors;}
    public T getData(){return this.data;}
}
