/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName,int filmAgeRating){
        name = filmName;
        ageRating = filmAgeRating;
    }
    
    public String name(){
     return name;   
    }
    public int ageRating(){
     return ageRating;   
    }
}
