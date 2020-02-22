package com.ragul.car.dto;

import java.io.Serializable;

public class CarRecommenderDto implements Serializable {
     private Double carValue;

     private String careModel;

    public Double getCarValue() {
        return carValue;
    }

    public void setCarValue(Double carValue) {
        this.carValue = carValue;
    }

    public String getCareModel() {
        return careModel;
    }

    public void setCareModel(String careModel) {
        this.careModel = careModel;
    }
}
