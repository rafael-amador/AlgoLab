package Menus;

public class MenuPrinter {
    //========================================<< Print Menu Methods >>========================================//
    public void printMainMenu(){
        System.out.println("\n\n");
        System.out.println("|==========>> ALGO_LAB MENU <<==========|");
        System.out.println("|           0: Exit AlgoLab             |");
        System.out.println("|           1: Calculators              |");
        System.out.println("|           2: Data Structures          |");
        System.out.println("|           3: Sort                     |");
        System.out.println("|           4: Search                   |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printCalculatorsMenu(){
        System.out.println("\n\n");
        System.out.println("|===========>> CALCULATORS <<===========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Basic Calculator         |");
        System.out.println("|           2: Advanced Calculator      |");
        System.out.println("|           3: Prime Calculator         |");
        System.out.println("|           4: GCD/LCM Calculator       |");
        System.out.println("|           5: Matrix Calculator        |");
        System.out.println("|           6: Binary Calculator        |");
        System.out.println("|           7: Hexadecimal Calulator    |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printDataStructuresMenu(){
        System.out.println("\n\n");
        System.out.println("|=========>> DATA STRUCTURES <<=========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Linked Lists             |");
        System.out.println("|           2: Binary Trees             |");
        System.out.println("|           3: Graphs                   |");
        System.out.println("|           4: Stacks                   |");
        System.out.println("|           5: Queues                   |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printSortMenu(){
        System.out.println("\n\n");
        System.out.println("|============>> SORT MENU <<============|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Bubble Sort              |");
        System.out.println("|           2: Insertion Sort           |");
        System.out.println("|           3: Merge Sort               |");
        System.out.println("|           4: Quick Sort               |");
        System.out.println("|           5: Bucket Sort              |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printSearchMenu(){
        System.out.println("\n\n");
        System.out.println("|===========>> SEARCH MENU <<===========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Linear Search            |");
        System.out.println("|           2: Binary Search            |");
        System.out.println("|           3: Hash Search              |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    //--------------------------------->> Data Structure Menus <<---------------------------------//
    public void printLinkedListMenu(){
        System.out.println("\n\n");
        System.out.println("|=========>> LINKEDLIST MENU <<=========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Create List              |");
        System.out.println("|           2: Delete List              |");
        System.out.println("|           3: Insert Element           |");
        System.out.println("|           4: Remove Element           |");
        System.out.println("|           5: Display Lists            |");
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printBinaryTreeMenu(){
        System.out.println("\n\n");
        System.out.println("|==========>> BINTREE MENU <<===========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Create Tree              |");
        System.out.println("|           2: Delete Tree              |");
        System.out.println("|           3: Insert Node              |");
        System.out.println("|           4: Remove Node              |");
        System.out.println("|           5: Display Trees            |"); //inorder, postorder, preorder
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printGraphsMenu(){
        System.out.println("\n\n");
        System.out.println("|===========>> GRAPHS MENU <<===========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Create Graph             |");
        System.out.println("|           2: Delete Graph             |");
        System.out.println("|           3: Insert Vertex            |");
        System.out.println("|           4: Add edge                 |");
        System.out.println("|           5: Remove Vertex            |");
        System.out.println("|           6: Remove Edge              |");
        System.out.println("|           7: Check Connectivity       |"); 
        System.out.println("|           8: Display Graphs           |"); 
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printStacksMenu(){
        System.out.println("\n\n");
        System.out.println("|===========>> STACKS MENU <<===========|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Create Stack             |");
        System.out.println("|           2: Delete Stack             |");
        System.out.println("|           3: Push Element             |");
        System.out.println("|           4: Pop Element              |");
        System.out.println("|           5: Display Stack            |"); 
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
    public void printQueueMenu(){
        System.out.println("\n\n");
        System.out.println("|===========>> QUEUE MENU <<============|");
        System.out.println("|           0: Back                     |");
        System.out.println("|           1: Create Queue             |");
        System.out.println("|           2: Delete Queue             |");
        System.out.println("|           3: Enqueue Element          |");
        System.out.println("|           4: Dequeue Element          |");
        System.out.println("|           5: Display Queue            |"); 
        System.out.println("|=======================================|");
        System.out.println("\n\n");
        System.out.print("User Choice: ");
    }
}
