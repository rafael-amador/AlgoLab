package Managers.DataStructures;
import Managers.DataStructures.Nodes.GraphNode;

import java.util.ArrayList;

public class Graph<T> {
    private ArrayList<GraphNode<T>> vertices;

    public Graph(){//default constructor
        this.vertices = new ArrayList<>();
    }
    public Graph(ArrayList<GraphNode<T>> vertices){//parametized constructor
        this.vertices = vertices;
    }
}
