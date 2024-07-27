package structuralDesign.compositePattern;

public class Leaf implements Component{
    private String name;
    private int size;

    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("File: " + name);
    }

    public int getSize() {
        return size;
    }
}
