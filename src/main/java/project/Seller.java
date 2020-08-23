package project;

public class Seller {
    
    private static int count = 0;

    private String name;
    private int ID;

    public Seller(String name) {
        this.name = name;
        this.ID = count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return " [name=" + name + "]";
    }


}