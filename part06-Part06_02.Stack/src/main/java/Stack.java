/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void add(String value) {
        stack.add(value);
    }

    public  ArrayList<String> values() {
        return stack;
    }

    public String take() {
        return stack.remove(stack.size() - 1); // pop
    }
}