package com.mycompany.libraryapp;

/**
 *
 * @author Juan Paternostro
 */
public class Admin extends Person {
    private static final int MAX_LOANS = 2;

    public Admin(String id_Card, String names, String lastNames) {
        super(id_Card, names, lastNames, "Administrativo");
    }

    @Override
    public boolean canLend() {
        return getCurrentLoan() < MAX_LOANS;
    }
}