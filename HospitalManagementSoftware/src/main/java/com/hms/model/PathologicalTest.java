package com.hms.model;

public class PathologicalTest extends LabTest implements TestReport,CostCalculation {

    private String reagent;

    // Constructor
    public PathologicalTest() {
    }
    public PathologicalTest(String title, int cost, boolean isAvailable, String reagent){
        super(title,cost,isAvailable);
        this.reagent =reagent;
    }
    
    @Override
    public String returnLabTestInfo() {
        String output = super.returnLabTestInfo() + "\n" 
                        + "Reagent: " + this.reagent + "\n"; 
        return output;
    }

    public String show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deliverReport() {
        return true;
    }

    @Override
    public double calcCost() {
        return 0;
    }
    

  
}
    
