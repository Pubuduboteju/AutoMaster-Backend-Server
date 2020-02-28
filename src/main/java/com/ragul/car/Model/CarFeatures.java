package com.ragul.car.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carFeatures")
public class CarFeatures {
    @Id
    private String vehicleModel;
    private String make;
    private String bodyType;
    private String fuelType;
    private int drivingPerformance;
    private int safety;
    private int seatingCapacity;
    private int comfortRide;
    private int fuelEconomy;
    private int luxuryLook;
    private int sportyDesign;
    private int prestige;
    private int marketValue;

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDrivingPerformance() {
        return drivingPerformance;
    }

    public void setDrivingPerformance(int drivingPerformance) {
        this.drivingPerformance = drivingPerformance;
    }

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getComfortRide() {
        return comfortRide;
    }

    public void setComfortRide(int comfortRide) {
        this.comfortRide = comfortRide;
    }

    public int getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public int getLuxuryLook() {
        return luxuryLook;
    }

    public void setLuxuryLook(int luxuryLook) {
        this.luxuryLook = luxuryLook;
    }

    public int getSportyDesign() {
        return sportyDesign;
    }

    public void setSportyDesign(int sportyDesign) {
        this.sportyDesign = sportyDesign;
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }
}
