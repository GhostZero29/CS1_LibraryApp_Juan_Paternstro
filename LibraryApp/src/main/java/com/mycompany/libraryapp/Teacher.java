
package com.mycompany.libraryapp;

/**
 *
 * @author Juan Paternostro
 */
public class Teacher extends Person {
    private static final int MAX_LOANS = 3;

    public Teacher(String id_Card, String names, String lastNames) {
        super(id_Card, names, lastNames, "Docente");
    }

    @Override
    public boolean canLend() {
        return getCurrentLoan() < MAX_LOANS;
    }
}
