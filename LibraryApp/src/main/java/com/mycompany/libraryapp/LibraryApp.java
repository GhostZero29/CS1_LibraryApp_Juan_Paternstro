package com.mycompany.libraryapp;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        
        library.registerPerson(new Student("12345", "Juan", "Paternostro"));
        library.registerPerson(new Teacher("54321", "Maria", "Gonzalez"));
        library.registerPerson(new Admin("98743", "Valentina", "Osorio"));
        
        library.catalogMaterials.addMaterial(new Material("AU12345", "Java Basics", "01/01/2024", 10));
        
        library.loanMaterial("12345", "AU12345");
        library.renewMaterial("12345", "AU12345");
        library.returnMaterial("12345", "AU12345"); 

        // Mostrar historial de movimientos
        library.showMovements();

        scanner.close();
    }
}
