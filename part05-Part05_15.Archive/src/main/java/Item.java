/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Item {
    private String identifier;
    private String name;

    public Item (String identifier,String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        Item item = (Item) compared;
        return this.identifier.equals(item.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
