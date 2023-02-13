package org.example;

public class Notebook {
    private String name;
    private String ram;
    private String colour;

    public Notebook(String name, String ram, String colour) {
        this.name = name;
        this.ram = ram;

        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Notebook [name=" + name + ", ram=" + ram + ", colour=" + colour + "]";
    }
}