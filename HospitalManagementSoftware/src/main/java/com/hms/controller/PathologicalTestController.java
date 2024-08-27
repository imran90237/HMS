/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;
import com.hms.model.PathologicalTest;

/**
 *
 * @author Imran
 */
public class PathologicalTestController {
    
    PathologicalTest pTest;
    
    public void initializePathologicalTest(
    String title,
    double cost,
    boolean isAvailable){
        //pTest =new PathologicalTest(title,cost,isAvailable);
    }
        
    public String returnPTestInfo(){
        String pTestInfo =pTest.show();
        return pTestInfo;
   
    }
    
}
