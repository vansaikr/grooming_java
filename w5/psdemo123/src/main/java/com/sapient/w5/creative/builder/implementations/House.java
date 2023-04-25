package com.sapient.w5.creative.builder.implementations;

import com.sapient.w5.creative.builder.facades.HousePlan;
import lombok.Data;

@Data
public class House implements HousePlan {
    private String basement;
    private String structure;
    private String roof;
    private String interior;
    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
}
