package com.mycompany.libraryapp;

/**
 *
 * @author Juan Paternostro
 */

public class Movement {
    private final String materialId;
    private final String type;
    private final String idCard;

    public Movement(String materialId, String type, String idCard) {
        this.materialId = materialId;
        this.type = type;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "materialId='" + materialId + '\'' +
                ", type='" + type + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
