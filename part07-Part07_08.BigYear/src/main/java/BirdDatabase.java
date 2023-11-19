/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdDatabase;
    private int observations;

    public BirdDatabase() {
        this.birdDatabase = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdDatabase.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birdDatabase) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}