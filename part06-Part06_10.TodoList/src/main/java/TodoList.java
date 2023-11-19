/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList () {
        this.list = new ArrayList<>();
    }
    public void add (String task) {
        this.list.add(task);
    }

    public void print () {
        int i = 1;
        for (String task : list) {
            System.out.println(i + ": " + task);
            i++;
        }
    }

    public void remove (int number) {
        this.list.remove(number-1);
    }
}
