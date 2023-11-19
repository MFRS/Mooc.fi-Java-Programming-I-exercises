/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Gauge {
    private int value;
    public Gauge(){
        this.value =0;
    }

    public void increase(){
        if(this.value<5){
            this.value++;
        }
    }
    public void decrease(){
        if(this.value>0){
            this.value--;
        }
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
        if(this.value==5){
            return true;
        }
        return false;
    }
    
}