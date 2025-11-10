import java.util.Scanner;
import java.util.Stack;

import Managers.CalculatorManager;
import Managers.DataStructureManager;
import Managers.SearchManager;
import Managers.SortManager;
import Menus.MenuPrinter;

public class MenuDriver {
    private final Scanner scnr;
    private final Stack<String> menuStack = new Stack<>(); //keeps tracks of user position in menu

    private final CalculatorManager calculatorManager = new CalculatorManager();
    private final DataStructureManager dataStructureManager = new DataStructureManager();
    private final SearchManager searchManager = new SearchManager();
    private final SortManager sortManager = new SortManager();

    private final MenuPrinter menuPrinter = new MenuPrinter(); //Object that stores/prints all menus

    public MenuDriver(){ //Default Constructor
        scnr = new Scanner(System.in);
        menuStack.push("MAIN"); //starts at main menu
    }
    public MenuDriver(Scanner scnr){ //Overloaded Constructor
        this.scnr = scnr;
        menuStack.push("MAIN"); //starts at main menu
    }
    public void run(){
        while (!menuStack.isEmpty()){
            String currentMenu = menuStack.peek(); //looks at top of stack to see where the user is in the menu

            switch (currentMenu) {
                //main
                case "EXITPROGRAM" -> exitProgram();
                case "MAIN" -> mainMenu();
                case "CALCULATOR" -> calculatorsMenu();
                case "DATASTRUCTURES" -> dataStructuresMenu();
                case "SORT" -> sortMenu();
                case "SEARCH" -> searchMenu();

                //datastructures
                case "LINKEDLIST" -> linkedListMenu();
                case "BINARYTREE" -> binaryTreeMenu();
                case "GRAPH" -> graphMenu();
                case "STACK" -> stackMenu();
                case "QUEUE" -> queueMenu();

                default -> {
                    System.out.println("Unknown Menu: " + currentMenu);
                    menuStack.clear(); //removes all menu's
                    menuStack.push("MAIN"); //reset to main menu
                }
            }
        }
    }
    private void exitProgram(){
        System.out.println("\nRe-Confirm to exit Program !!!ALL DATA WILL BE LOST!!!");
        System.out.print("Type yes to Exit Program, Type no to cancel: ");
        String input = scnr.next(); 
        scnr.nextLine();

        if (input.equals("yes")){
            System.out.println("\nExit confirmed, exiting the program");
            menuStack.clear();
        }
        else{
            System.out.println("\nExit cancelled, continuing the program");
            menuStack.clear();
            menuStack.push("MAIN");
        }
    }
    //========================================<< Menu Method Drivers >>========================================//
    private void mainMenu(){
        menuPrinter.printMainMenu();
        String choice  = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.push("EXITPROGRAM"); //pop all menu's off to stop the run method and end the program
            case "1" -> menuStack.push("CALCULATOR");
            case "2" -> menuStack.push("DATASTRUCTURES");
            case "3" -> menuStack.push("SORT");
            case "4" -> menuStack.push("SEARCH");
            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void calculatorsMenu(){
        menuPrinter.printCalculatorsMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> calculatorManager.basicCalculator();
            case "2" -> calculatorManager.advancedCalculator();
            case "3" -> calculatorManager.primeCalculator();
            case "4" -> calculatorManager.gcdlcmCalculator();
            case "5" -> calculatorManager.matrixCalculator();
            case "6" -> calculatorManager.binaryCalculator();
            case "7" -> calculatorManager.hexadecimalCalculator();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void dataStructuresMenu(){
        menuPrinter.printDataStructuresMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> menuStack.push("LINKEDLIST");
            case "2" -> menuStack.push("BINARYTREE");
            case "3" -> menuStack.push("GRAPH");
            case "4" -> menuStack.push("STACK");
            case "5" -> menuStack.push("QUEUE");

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void sortMenu(){
        menuPrinter.printSortMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> sortManager.bubbleSort();
            case "2" -> sortManager.insertionSort();
            case "3" -> sortManager.mergeSort();
            case "4" -> sortManager.quickSort();
            case "5" -> sortManager.bucketSort();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void searchMenu(){
        menuPrinter.printSearchMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> searchManager.linearSearch();
            case "2" -> searchManager.binarySearch();
            case "3" -> searchManager.hashSearch();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void linkedListMenu(){
        menuPrinter.printLinkedListMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> dataStructureManager.createLinkedList();
            case "2" -> dataStructureManager.insertLinkedList();
            case "3" -> dataStructureManager.deleteLinkedList();
            case "4" -> dataStructureManager.diplayLinkedList();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void binaryTreeMenu(){
        menuPrinter.printBinaryTreeMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> dataStructureManager.createTree();
            case "2" -> dataStructureManager.insertTreeNode();
            case "3" -> dataStructureManager.deleteTreeNode();
            case "4" -> dataStructureManager.displayTree();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void graphMenu(){
        menuPrinter.printGraphsMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> dataStructureManager.insertGraphVertex();
            case "2" -> dataStructureManager.addGraphEdge();
            case "3" -> dataStructureManager.checkGraphConnections();
            case "4" -> dataStructureManager.displayGraph();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void stackMenu(){
        menuPrinter.printStacksMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> dataStructureManager.pushStackElement();
            case "2" -> dataStructureManager.popStackElement();
            case "3" -> dataStructureManager.displayStack();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    private void queueMenu(){
        menuPrinter.printQueueMenu();
        String choice = scnr.nextLine();

        switch(choice) {
            case "0" -> menuStack.pop(); //pop top of stack to go back
            case "1" -> dataStructureManager.enqueueQueueElement();
            case "2" -> dataStructureManager.dequeueQueueElement();
            case "3" -> dataStructureManager.displayQueue();

            default -> {
                System.out.println("Invalid Choice.");
                System.out.println("Try Again: ");
            }
        }
    }
    
    
    
}
