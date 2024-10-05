package com.mycompany.libraryapp;

/**
 * @author Juan Paternostro
 */

import java.util.ArrayList;
import java.util.List;

public class CatalogMaterials {
    private final List<Material> materials;
    
    public CatalogMaterials(){
        this.materials = new ArrayList<>();
    }

    // Método para agregar material
    public void addMaterial(Material material) {
        if (getMaterialById(material.getIdentifier()) != null) {
            System.out.println("A material with the identifier already exists: " + material.getIdentifier());
            return;
        }
        materials.add(material);
        System.out.println("Material added correctly: " + material.getTitle());
    }

    // Método para eliminar material
    public void deleteMaterial(String identifier) {
        Material materialToDelete = getMaterialById(identifier);
        if (materialToDelete != null) {
            materials.remove(materialToDelete);
            System.out.println("Material disposed of correctly: " + materialToDelete.getTitle());
        } else {
            System.out.println("No material with the identifier was found: " + identifier);
        }
    }

    // Método para buscar material por ID
    public Material getMaterialById(String identifier) {
        for (Material m : materials) {
            if (m.getIdentifier().equalsIgnoreCase(identifier)) {
                return m;
            }
        }
        return null;
    }

    // Método para mostrar todos los materiales
    public void showAllMaterials() {
        if (materials.isEmpty()) {
            System.out.println("No materials registered in the catalog.");
        } else {
            System.out.println("=== LIST OF MATERIALS ===");
            for (Material m : materials) {
                System.out.println(m.toString());
            }
        }
    }
}