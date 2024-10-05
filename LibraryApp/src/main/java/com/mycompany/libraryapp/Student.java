package com.mycompany.libraryapp;

/**
 *
 * @author Juan Paternostro
 */

public class Student extends Person {
    private static final int MAX_LOANS = 5;

    public Student(String id_Card, String names, String lastNames) {
        super(id_Card, names, lastNames, "Estudiante");
    }

    @Override
    public boolean canLend() {
        return getCurrentLoan() < MAX_LOANS;
    }
}
