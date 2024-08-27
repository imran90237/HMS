/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.model.RadiologicalTest;
import com.hms.view.home;

/**
 *
 * @author Imran
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        //new LogingPage().setVisible(true);
    
//        // Create an instance of PathologicalTest
        PathologicalTest pTest = new PathologicalTest("CBC", 300, true, "Hemoglobin Reagent");

//        // Print the test details using the show method
        System.out.println(pTest.returnLabTestInfo());
        //System.out.println(pTest2.returnLabTestInfo());

//
//        // Create an instance of RadiologicalTest
//        RadiologicalTest rTest = new RadiologicalTest("X-ray", 500, true, "10x12 inches");
//        // Print the test details using the show method
//        System.out.println(rTest.returnLabTestInfo());
    }
}


