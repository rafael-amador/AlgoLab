//used to keep and find structures
package Managers.DataStructures.StructureHolder;

public class StructureHolder<T> { //generic so it can hold any type of structure
    private T structure;
    private String name;
    private String type;

    //setters
    public void setStructure(T structure){this.structure = structure;}
    public void setName(String name){this.name = name;}
    public void setType(String type){this.type = type;}
    //getters
    public T getStructure(){return this.structure;}
    public String getName(){return this.name;}
    public String getType(){return this.type;}

    public StructureHolder(){ //default constructor
        structure = null;
        name = "";
        type = "";
        System.out.println("StructureHolder() was created.");
    }
    public StructureHolder(T structure){ //parameterized constructor
        this.structure = structure;
        name = "";
        type = structure.getClass().getSimpleName();
        System.out.println("StructureHolder(structure) was created.");
    }
    public StructureHolder(T structure, String name){ //parameterized constructor
        this.structure = structure;
        this.name = name;
        type = structure.getClass().getSimpleName();
        System.out.println("StructureHolder(" + type + ", " + name + ") was created.");
    }

    
}
