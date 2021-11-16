/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Shoe {
    private String shoeName;
    private int shoePrise;
    private int count;
    
    public Shoe(){
        
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public int getShoePrise() {
        return shoePrise;
    }

    public void setShoePrise(int shoePrise) {
        this.shoePrise = shoePrise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Shoe{" + "shoeName=" + shoeName + ", shoePrise=" + shoePrise + ", count=" + count + '}';
    }
    
}
