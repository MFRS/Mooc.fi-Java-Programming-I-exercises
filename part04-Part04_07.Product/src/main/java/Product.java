/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
   
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(this.name +", price "+this.price +", "+this.quantity +" pcs");
    }
    
    
}
