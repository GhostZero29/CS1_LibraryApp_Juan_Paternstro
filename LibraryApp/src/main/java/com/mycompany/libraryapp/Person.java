package com.mycompany.libraryapp;

import java.util.List;

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
 
public class Student extends Person{
    private static final int MAX_LOANS = 5;
    
    public Student(String id_Card, String Names, String lastNames){
        super(id_Card, names, lastNames,"Student");
    }
    
    
    @Override
    public boolean canLend(){
        return getCurrentLoan() < MAX_LOANS;
    }    
}
public class teacher extends Person{
    private static final int MAX_LOANS = 3;
    
    public  teacher(String id_Card, String names, String lastNames){
        super(id_Card, names, lastNames, "teacher");
    }
    
    @Override
    public boolean canLend(){
        return getCurrentLoan() < MAX_LOANS;
    }
}
public class admin extends Person{
    private static final int MAX_LOANS = 2;
    public admin(String id_Card, String names, String lastNames){
        super(id_Card, names, lastNames, "admin");
    }
    @Override
    public boolean canLend(){
        return getCurrentLoan() < MAX_LOANS;
    }
} 

    public void register(String id_Card, String names, String lastNames, String rol){
    this.id_Card = id_Card;
    this.names = names;
    this.lastNames = lastNames;
    this.rol = rol;
    
    }
   
    public void delete(String ID_Card, List<Person> persons) {
    if (this.currentLoan > 0) {
        System.out.println("No se puede eliminar a la persona con cédula " + ID_Card + " porque tiene materiales prestados.");
        return;
    }
    for (int i = 0; i < persons.size(); i++) {
        if (persons.get(i).getid_Card().equals(ID_Card)) {
            persons.remove(i);
            System.out.println("Persona eliminada correctamente: " + this.names + " " + this.lastNames);
            return;
        }
    }
    System.out.println("No se encontró a la persona con cédula: " + ID_Card);
}

    public void update(String id_Card, String names, String lastNames, String rol){
        this.id_Card = id_Card;
        this.names = names;
        this.lastNames = lastNames;
        this.rol = rol;
    }
}    
