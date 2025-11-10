package Managers;

import java.util.ArrayList;

import Managers.DataStructures.BinaryTree;
import Managers.DataStructures.Graph;
import Managers.DataStructures.LinkedList;
import Managers.DataStructures.Queue;
import Managers.DataStructures.Stack;



public class DataStructureManager {

    ArrayList<BinaryTree<String>> treeArr = new ArrayList<>();
    ArrayList<Graph<String>> graphArr = new ArrayList<>();
    ArrayList<LinkedList<String>> listArr = new ArrayList<>();
    ArrayList<Queue<String>> queueArr = new ArrayList<>();
    ArrayList<Stack<String>> stackArr = new ArrayList<>();



    //========================================<< Data Structure Methods >>====================================//
    //----------------------------------------<< Linked List Methods >>---------------------------------------//
    public void createLinkedList(){
        listArr.add(new LinkedList<>());
    }
    public void deleteLinkedList(){

    }
    public void insertListElement(){

    }
    public void removeListElement(){

    }
    public void diplayList(){

    }
    //----------------------------------------<< Binary Tree Methods >>---------------------------------------//
    public void createBinaryTree(){

    }
    public void deleteBinaryTree(){

    }
    public void insertTreeElement(){

    }
    public void removeTreeElement(){

    }
    public void displayTree(){

    }
    //-------------------------------------------<< Graph Methods >>------------------------------------------//
    public void createGraph(){

    }
    public void deleteGraph(){

    }
    public void insertGraphVertex(){

    }
    public void addGraphEdge(){

    }
    public void removeGraphVertex(){

    }
    public void removeGraphEdge(){

    }
    public void checkGraphConnections(){

    }
    public void displayGraph(){

    }
    //-------------------------------------------<< Stack Methods >>------------------------------------------//
    public void createStack(){

    }
    public void deleteStack(){

    }
    public void pushStackElement(){

    }
    public void popStackElement(){
        
    }
    public void displayStack(){
        
    }
    //-------------------------------------------<< Queue Methods >>------------------------------------------//
    public void createQueue(){

    }
    public void deleteQueue(){

    }
    public void enqueueQueueElement(){

    }
    public void dequeueQueueElement(){
        
    }
    public void displayQueue(){
        
    }
}
