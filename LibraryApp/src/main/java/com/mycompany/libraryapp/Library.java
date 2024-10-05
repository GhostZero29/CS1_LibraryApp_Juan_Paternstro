package com.mycompany.libraryapp;

/**
 * @author Juan Paternostro
 */

import java.util.ArrayList;
import java.util.List;

public class Library {
    CatalogMaterials catalogMaterials;
    private final List<Person> registeredPersons;
    private final List<Movement> movements; 

    public Library() {
        this.catalogMaterials = new CatalogMaterials();
        this.registeredPersons = new ArrayList<>();
        this.movements = new ArrayList<>();
    }

    // Métodos para registrar personas
    public void registerPerson(Person person) {
        if (getPersonByIdCard(person.getid_Card()) != null) {
            System.out.println("There is already a person with a cedula: " + person.getid_Card());
            return;
        }
        registeredPersons.add(person);
        System.out.println("Person correctly registered: " + person.getNames() + " " + person.getLastNames());
    }

    public void deletePerson(String idCard) {
        Person personToDelete = getPersonByIdCard(idCard);
        if (personToDelete != null && personToDelete.getCurrentLoan() == 0) {
            registeredPersons.remove(personToDelete);
            System.out.println("Person correctly eliminated: " + personToDelete.getNames());
        } else {
            System.out.println("The person cannot be removed or has borrowed materials.");
        }
    }

    private Person getPersonByIdCard(String idCard) {
        for (Person p : registeredPersons) {
            if (p.getid_Card().equals(idCard)) {
                return p;
            }
        }
        return null;
    }

    // Métodos para manejar préstamos, renovaciones y devoluciones
    public void loanMaterial(String idCard, String materialId) {
        Person person = getPersonByIdCard(idCard);
        Material material = catalogMaterials.getMaterialById(materialId);

        if (person != null && material != null && person.canLend()) {
            material.makeLoan();
            person.increaseCurrentLoans();
            movements.add(new Movement(materialId, "Loan", idCard));
            System.out.println("Registered loan.");
        } else {
            System.out.println("The loan cannot be made. Please verify the data.");
        }
    }

    public void renewMaterial(String idCard, String materialId) {
        Person person = getPersonByIdCard(idCard);
        Material material = catalogMaterials.getMaterialById(materialId);

        if (person != null && material != null) {
            material.renew();
            movements.add(new Movement(materialId, "Renewal", idCard));
            System.out.println("Registered renewal.");
        } else {
            System.out.println("The material cannot be renewed. Check the data.");
        }
    }

    public void returnMaterial(String idCard, String materialId) {
        Person person = getPersonByIdCard(idCard);
        Material material = catalogMaterials.getMaterialById(materialId);

        if (person != null && material != null) {
            material.returnMaterial();
            person.decreaseCurrentLoans();
            movements.add(new Movement(materialId, "Return", idCard));
            System.out.println("Registered return.");
        } else {
            System.out.println("Material cannot be returned. Please verify the data.");
        }
    }

    // Mostrar historial de movimientos
    public void showMovements() {
        if (movements.isEmpty()) {
            System.out.println("There are no movements recorded.");
        } else {
            System.out.println("=== TRANSACTION HISTORY ===");
            for (Movement m : movements) {
                System.out.println(m);
            }
        }
    }
}
