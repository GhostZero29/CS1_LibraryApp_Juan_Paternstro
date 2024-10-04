package com.mycompany.libraryapp;

/**
 * @author Juan Paternostro
 */
public abstract class Person {
    private String id_Card;
    private String names;
    private String lastNames;
    private String rol;
    private int currentLoan;
    
    
    public Person(String id_Card, String names, String lastNames, String rol){
        this.id_Card = id_Card;
        this.names = names;
        this.lastNames = lastNames;
        this.rol = rol;
        this.currentLoan = 0;
    }
    
    public String getid_Card() {
        return id_Card;
    }

    public void setid_Card(String id_Card) {
        this.id_Card = id_Card;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getCurrentLoan() {
        return currentLoan;
    }

    public void setCurrentLoan(int currentLoan) {
        this.currentLoan = currentLoan;
    }
    public void increaseCurrentLoans(){
        currentLoan++;
    }
    public void decreaseCurrentLoans(){
        currentLoan--;
    }
    public abstract boolean canLend();
 
    
    public void register(String id_Card, String names, String lastNames, String rol){
    this.id_Card = id_Card;
    this.names = names;
    this.lastNames = lastNames;
    this.rol = rol;
    
    }
   
    public void delete(String ID_Card){
        this.id_Card = ID_Card;
        if (this.id_Card.equals(ID_Card)){
            //Falta logica para eliminar
        }
    }
    
    public void update(String id_Card, String names, String lastNames, String rol){
        this.id_Card = id_Card;
        this.names = names;
        this.lastNames = lastNames;
        this.rol = rol;
    }
}    

