package com.mycompany.libraryapp;

/**
 * @author Juan Paternostro
 */

public class Material {
    private String identifier;
    private String title;
    private String dateRecord;
    private int registerQuantity;
    private int actualAmount;
    private int renewCount;

    public Material(String identifier, String title, String dateRecord, int registerQuantity) {
        this.identifier = identifier;
        this.title = title;
        this.dateRecord = dateRecord;
        this.registerQuantity = registerQuantity;
        this.actualAmount = registerQuantity;
        this.renewCount = 0;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(String dateRecord) {
        this.dateRecord = dateRecord;
    }

    public int getRegisterQuantity() {
        return registerQuantity;
    }

    public void setRegisterQuantity(int registerQuantity) {
        this.registerQuantity = registerQuantity;
    }

    public int getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(int actualAmount) {
        this.actualAmount = actualAmount;
    }
    
    public void update(String title, String dateRecord){
        this.title = title;
        this.dateRecord= dateRecord;
        System.out.println("Correctly updated material.");
    }
    public void increaseRegisteredQuantity(int additionalUnits){
        if (additionalUnits > 0){
            this.registerQuantity += additionalUnits;
            this.actualAmount += additionalUnits;
            System.out.println("Registered amount increased by"+ additionalUnits + "units" );
        }
        else{
            System.out.println("The amount to be increased must be greater than zero");
        }
        
    }
    public void makeLoan(){
        if (this.actualAmount > 0){
            this.actualAmount--;
            System.out.println("Registered loan for the material:"+ this.title);
        }
        else{
            System.out.println("No units available for loan of the material: "+ this.title);
        }
    }
    public void renew(){
        if (this.renewCount < 3){
            this.renewCount++;
            System.out.println("Renewed loan for the material:"+ this.title);
        }
        else{
            System.out.println("The loan of the material cannot be renewed more than 3 times:" + this.title);
        }
    }
    public void returnMaterial(){
        if(this.actualAmount < this.registerQuantity){
            this.actualAmount++;
            System.out.println("Return registered for the material:" + this.title);
        }
        else{
            System.out.println("All copies of this material are already in the library." + this.title);
        }
    }
    @Override
    public String toString(){
        return "Material{" +
                "Identifier='" + identifier + '\'' +
                ", Title='" + title + '\'' +
                ", dateRecord='" + dateRecord + '\'' +
                ", registerQuantity=" + registerQuantity +
                ", actualAmount=" + actualAmount +
                ", renewCount=" + renewCount +
                '}';
    }
}
