
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author imran
 */
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;

    // Default constructor
    public  LabTest() {}

    // Parameterized constructor
    public LabTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

   
    public String returnLabTestInfo() {
        String output ="Test name:"+ this.title+ "\n"
        +"cost:"+this.cost+"\n"
          +"Availability:"+this.isAvailable;
        return output;
    }
}

    

