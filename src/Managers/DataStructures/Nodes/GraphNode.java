//Used for Graph only
package Managers.DataStructures.Nodes;

import java.util.ArrayList;

public class GraphNode<T> {
    private ArrayList<GraphNode<T>> neighbors;

    //setters
    public void setNeighbors(ArrayList<GraphNode<T>> neighbors){this.neighbors = neighbors;}
    //getters
    public ArrayList<GraphNode<T>> getNeighbors(){return this.neighbors;}
}
