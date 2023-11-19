/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */

public class Gift {
    private String name;
    private int weight;

    public Gift (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight () {
        return this.weight;
    }

    public String toString () {
        return this.name + " (" + this.weight + " kg)";
    }

}
