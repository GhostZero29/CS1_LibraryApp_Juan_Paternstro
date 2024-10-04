
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


    public Material(String identifier, String title, String dateRecord) {
        this.identifier = identifier;
        this.title = title;
        this.dateRecord = dateRecord;
        this.registerQuantity = registerQuantity;
        this.actualAmount = registerQuantity;
    }   
    
    public void register(String identifier, String title, String dateRecord) {
        if(identifier == null || identifier.isEmpty()){
            System.out.println("The material identifier cannot be empty.");
            return;
        }
         this.identifier = identifier;
         this.title = title;
         this.dateRecord = dateRecord;
         this.actualAmount = this.registerQuantity;
     }
    public void delete(String identifier) {
        if (this.identifier.equals(identifier)) {
            System.out.println("The material identifier does not match.");
            return;
            }
            // Falta Logica para borrado
            this.identifier = null;
            this.title = null;
            this.dateRecord = null;
        }
    
    public void update(String identifier, String title, String dateRecord) {
        if (this.identifier.equals(identifier)) {
            this.title = title;
            this.dateRecord = dateRecord;
        }
    }

    public void increaseRegisteredQuantity(String identifier) {
        if (this.identifier.equals(identifier)) {
            this.registerQuantity++;  // Incrementador
        }
    }

    public void makeLoan(String identifier, String idCard) {
        if (this.identifier.equals(identifier) && this.actualAmount > 0) {
            this.actualAmount--;  // Dimuye cantidad dispo
        }
    }

    public void renew(String identifier, String idCard) {
        if (this.identifier.equals(identifier)) {
            // Falta Logica para renovar Prestamos
        }
    }

    public void returnMaterial(String identifier, String idCard) {
        if (this.identifier.equals(identifier)) {
            this.actualAmount++;  // Aumenta la cantiadad al devolver el libre,etc.
        }
    }
}

