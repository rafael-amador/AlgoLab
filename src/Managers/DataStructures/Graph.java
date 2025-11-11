package Managers.DataStructures;
import Managers.DataStructures.Nodes.GraphNode;

import java.util.ArrayList;

public class Graph<T extends Comparable<T>> {
    private ArrayList<GraphNode<T>> vertices;

    public Graph(){//default constructor
        this.vertices = new ArrayList<>();
        System.out.println("Graph() was created.");
    }
    public Graph(ArrayList<GraphNode<T>> vertices){//parametized constructor
        this.vertices = vertices;
        System.out.println("Graph(vertices) was created.");
    }

    public void insertVertex(){

    }
    public void addEdge(){

    }
    public void removeVertex(){

    }
    public void removeEdge(){

    }
    public void checkConnections(){

    }
    public void displayGraph(){

    }
}
