/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Book {

    private String title;
    private int pages;
    private int year;

    public Book (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle () {
        return this.title;
    }

    public int getPages () {
        return this.pages;
    }

    public int getYear () {
        return this.year;
    }

    public String toString () {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}