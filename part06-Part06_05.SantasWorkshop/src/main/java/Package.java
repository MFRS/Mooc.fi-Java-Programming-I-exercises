/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift (Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight () {
        int sum = 0;
        for (Gift gift : gifts) {
            sum += gift.getWeight();
        }
        return sum;
    }
}