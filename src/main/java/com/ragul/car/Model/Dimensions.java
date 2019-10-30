package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Dimensions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Dimensions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private String length;
    private String width;
    private String seatingCapacity;
    private String grossVehicleWeight;
    private String cargoCapacity;
    private String fuelConsumption_city;
    private String fuelConsumption_highway;
    private String fuelConsumption_combined;
    private String horsePower;
    private String turningCircle;
    private String tyreSize;
    private String wheelSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    public void setGrossVehicleWeight(String grossVehicleWeight) {
        this.grossVehicleWeight = grossVehicleWeight;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getFuelConsumption_city() {
        return fuelConsumption_city;
    }

    public void setFuelConsumption_city(String fuelConsumption_city) {
        this.fuelConsumption_city = fuelConsumption_city;
    }

    public String getFuelConsumption_highway() {
        return fuelConsumption_highway;
    }

    public void setFuelConsumption_highway(String fuelConsumption_highway) {
        this.fuelConsumption_highway = fuelConsumption_highway;
    }

    public String getFuelConsumption_combined() {
        return fuelConsumption_combined;
    }

    public void setFuelConsumption_combined(String fuelConsumption_combined) {
        this.fuelConsumption_combined = fuelConsumption_combined;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getTurningCircle() {
        return turningCircle;
    }

    public void setTurningCircle(String turningCircle) {
        this.turningCircle = turningCircle;
    }

    public String getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(String tyreSize) {
        this.tyreSize = tyreSize;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }
}
