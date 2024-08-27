/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.PathologicalTest;

/**
 *
 * @author Hp
 */
public class PathologicalTestController {

    private PathologicalTest pTest;

    // Method to initialize the PathologicalTest object
    public void initializePathologicalTest(String title, double cost, boolean isAvailable, String reagent) {
        // Create a new PathologicalTest object
        pTest = new PathologicalTest(title, (int) cost, isAvailable, reagent);
    }

    // Method to return the PathologicalTest information
    public String returnPTestInfo() {
        // Call the show method of PathologicalTest and return the information
        String pTestInfo = pTest.show();
        return pTestInfo;
    }
}

