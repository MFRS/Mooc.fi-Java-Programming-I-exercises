/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Cube {

    private int edgeLength;

    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume () {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }

    public String toString () {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
