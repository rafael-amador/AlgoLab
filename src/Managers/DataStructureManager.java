package Managers;
import java.util.Scanner;

import java.util.ArrayList;

import Managers.DataStructures.BinaryTree;
import Managers.DataStructures.Graph;
import Managers.DataStructures.LinkedList;
import Managers.DataStructures.Queue;
import Managers.DataStructures.Stack;

import Managers.DataStructures.StructureHolder.StructureHolder;


public class DataStructureManager {
    Scanner scnr;

    private ArrayList<StructureHolder<LinkedList<String>>> listArr = new ArrayList<>();
    private ArrayList<StructureHolder<BinaryTree<String>>> treeArr = new ArrayList<>();
    private ArrayList<StructureHolder<Graph<String>>> graphArr = new ArrayList<>();
    private ArrayList<StructureHolder<Stack<String>>> stackArr = new ArrayList<>();
    private ArrayList<StructureHolder<Queue<String>>> queueArr = new ArrayList<>();

    public DataStructureManager(Scanner scnr){//paramterized constructor
        this.scnr = scnr;
    }

    private String findName(){
        String name = "";
        System.out.println();
        System.out.println("=============================");
        System.out.print  ("|Enter a name: ");
        name = scnr.nextLine();
        System.out.println("=============================");
        System.out.println();
        return name;
    }

    //========================================<< Data Structure Methods >>====================================//
    //----------------------------------------<< Linked List Methods >>---------------------------------------//
    public void createLinkedList(){
        listArr.add(new StructureHolder<>(new LinkedList<>(), findName()));
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
        treeArr.add(new StructureHolder<>(new BinaryTree<>(), findName()));
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
        graphArr.add(new StructureHolder<>(new Graph<>(), findName()));
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
        stackArr.add(new StructureHolder<>(new Stack<>(), findName()));
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
        queueArr.add(new StructureHolder<>(new Queue<>(), findName()));
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
