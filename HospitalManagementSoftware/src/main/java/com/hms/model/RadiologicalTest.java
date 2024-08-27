/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Hp
 */
public class RadiologicalTest extends LabTest implements TestReport,CostCalculation {
    private String plateDimension;
       // Constructor
    public RadiologicalTest(String title, int cost, boolean isAvailable, String x12_inches) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        
        
    }
     @Override
    public String returnLabTestInfo() {
        String output = "Test name:"+this.title+"\n"
                +"cost:"+this.cost+"\n"
                +"plate Dimention: "+this.plateDimension+"\n"
                +"Availability:"+this.isAvailable+"\n";
        return output;
    }
//    
//    // Method to show test details
//   public String show() {
//        String output = "Test name: " + this.title + "<br>" 
//                      + "Cost: " + this.cost + "<br>";
//        return output;
//    }
//    

    public String show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public double calcCost(){
        double totalCost=0;
        return totalCost;
    }

    @Override
        public boolean deliverReport(){
        return false;
    }
}