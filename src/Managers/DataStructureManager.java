package Managers;
import java.util.Scanner;

import java.util.ArrayList;

import Managers.DataStructures.BinaryTree;
import Managers.DataStructures.Graph;
import Managers.DataStructures.LinkedList;
import Managers.DataStructures.Queue;
import Managers.DataStructures.Stack;
import Managers.DataStructures.Nodes.SingleLinkedNode;
import Managers.DataStructures.StructureHolder.StructureHolder;


public class DataStructureManager {
    Scanner scnr;

    private ArrayList<StructureHolder<LinkedList<String>>> listArr = new ArrayList<>();
    private ArrayList<StructureHolder<BinaryTree<String>>> treeArr = new ArrayList<>();
    private ArrayList<StructureHolder<Graph<String>>> graphArr = new ArrayList<>();
    private ArrayList<StructureHolder<Stack<String>>> stackArr = new ArrayList<>();
    private ArrayList<StructureHolder<Queue<String>>> queueArr = new ArrayList<>();

    String[] types = {"Linked List", "Binary Tree", "Graph", "Stack", "Queue"};

    public DataStructureManager(Scanner scnr){//paramterized constructor
        this.scnr = scnr;
    }

    private String findName(){ //done
        String name = "";
        System.out.println();
        System.out.println("=============================");
        System.out.print  ("|Enter a name: ");
        name = scnr.nextLine();
        System.out.println("=============================");
        System.out.println();
        return name;
    }
    private<T> void deleteArr(ArrayList<StructureHolder<T>> dataStructure, String type){ //done
        if (dataStructure.isEmpty()){
            System.out.println("No " + type + " has been created.");
        }
        else{
            int arrSize = dataStructure.size();
            System.out.println(arrSize + " "  + type + ((arrSize>1) ? "s have ":" has ") + "been created.");
            for (int i=0; i<arrSize; i++){
                System.out.println((i+1) + ": " + dataStructure.get(i).getName());
            }
            System.out.println();
            System.out.print("Type the number that corresponds to the " + type + " you want to delete: ");
            
            String stringChoice = scnr.nextLine();
            try {
                int intChoice = Integer.parseInt(stringChoice);
                if (intChoice > arrSize || intChoice < 1){
                    System.out.println("Invalid choice. Please enter a valid number.");
                }
                else{ //valid choice
                    System.out.println("Valid choice. " + dataStructure.get(intChoice-1).getName() + " was removed from " + type);
                    dataStructure.remove(intChoice - 1);
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number only.");
            }
        }
    }
    private <T> int findIndex(ArrayList<StructureHolder<T>> dataStructure, String type){
        if (dataStructure.isEmpty()){
            System.out.println("No " + type + " has been created.");
            return -1;
        }
        else{
            int arrSize = dataStructure.size();
            System.out.println(arrSize + " "  + type + ((arrSize>1) ? "s have ":" has ") + "been created.");
            for (int i=0; i<arrSize; i++){
                System.out.println((i+1) + ": " + dataStructure.get(i).getName());
            }
            System.out.println();
            System.out.print("Type the number that corresponds to the " + type + " you want: ");
            String stringChoice = scnr.nextLine();
            try {
                int index = Integer.parseInt(stringChoice);
                if (index > arrSize || index < 1){
                    System.out.println("Invalid choice. Please enter a valid number.");
                }
                else{ //valid choice
                    return index-1;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number only.");
            }
            return -1;
        }
    }
    private <T> StructureHolder<T> findStructure(ArrayList<StructureHolder<T>> dataStructure, String type){
        int index = findIndex(dataStructure, type);
        if (index == -1) return null;
        return dataStructure.get(index);
    }
    //========================================<< Data Structure Methods >>====================================//
    //----------------------------------------<< Linked List Methods >>---------------------------------------//
    public void createLinkedList(){ //done
        listArr.add(new StructureHolder<>(new LinkedList<>(), findName()));
    }
    public void deleteLinkedList(){ //done
        deleteArr(listArr, types[0]);
    }
    public void insertListElement(){
        StructureHolder<LinkedList<String>> structure = findStructure(listArr, types[0]);
        if (structure != null){
            structure.getStructure().displayList();
            System.out.print("Type the element you want to insert: ");
            String element = scnr.nextLine();
            structure.getStructure().insertNode(element);
        }
    }
    public void removeListElement(){
        StructureHolder<LinkedList<String>> structure = findStructure(listArr, types[0]);
        if (structure != null && structure.getStructure().isEmpty()){
            System.out.println(structure.getName() + " is empty. Can't remove elements. Try again.");
            return;
        }
        if (structure != null){
            structure.getStructure().displayList();
            System.out.print("Type the element you want to remove: ");
            String element = scnr.nextLine();
            String removeElement = String.valueOf(structure.getStructure().removeElement(element));
            if (removeElement != null){
                System.out.println("Remove was successful. Removed node that contained this data: \n" + removeElement);
            }
            else{
                System.out.println("Element not found. Remove was unsuccessful. Try Again");
            }
        }
    }
    public void diplayList(){
        StructureHolder<LinkedList<String>> structure = findStructure(listArr, types[0]);
        if (structure != null){
            structure.getStructure().displayList();
        }
    }
    //----------------------------------------<< Binary Tree Methods >>---------------------------------------//
    public void createBinaryTree(){ //done
        treeArr.add(new StructureHolder<>(new BinaryTree<>(), findName()));
    }
    public void deleteBinaryTree(){ //done
        deleteArr(treeArr, types[1]);
    }
    public void insertTreeElement(){
        
    }   
    public void removeTreeElement() {
        
    }
    public void displayTree(){
        
    }
    //-------------------------------------------<< Graph Methods >>------------------------------------------//
    public void createGraph(){ //done
        graphArr.add(new StructureHolder<>(new Graph<>(), findName()));
    }
    public void deleteGraph(){ //done
        deleteArr(graphArr, types[2]);
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
    public void createStack(){ //done
        stackArr.add(new StructureHolder<>(new Stack<>(), findName()));
    }
    public void deleteStack(){ //done
        deleteArr(stackArr, types[3]);
    }
    public void pushStackElement(){

    }
    public void popStackElement(){
        
    }
    public void displayStack(){
        
    }
    //-------------------------------------------<< Queue Methods >>------------------------------------------//
    public void createQueue(){ //done
        queueArr.add(new StructureHolder<>(new Queue<>(), findName()));
    }
    public void deleteQueue(){ //done
        deleteArr(queueArr, types[4]);
    }
    public void enqueueQueueElement(){

    }
    public void dequeueQueueElement(){
        
    }
    public void displayQueue(){
        
    }
}
