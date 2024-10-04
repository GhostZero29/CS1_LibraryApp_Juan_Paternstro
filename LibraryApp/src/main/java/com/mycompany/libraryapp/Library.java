
package com.mycompany.libraryapp;

/**
 * @author Juan Paternostro
 */
import java.util.ArrayList;
import java.util.List;
public class Library {

    private List<Material> materiales;
    private List<Persona> personas;

    public Library() {
        materiales = new ArrayList<>();
        personas = new ArrayList<>();
    }
    
}
