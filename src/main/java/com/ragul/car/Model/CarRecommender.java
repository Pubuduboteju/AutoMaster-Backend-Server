package com.ragul.car.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carRecommender")
public class CarRecommender {
    @Id
    @GeneratedValue
    private Long id;
    private String gender;
    private String job;
    private String ageGroup;
    private String monthlyIncome;
    private String noOfFamMembers;
    private String brandedPerson;
    private String howLongUseVehicle;
    private String considerMoneySpendOnFuel;
    private String avgKmsPerDriveMonth;
    private String considerResaleValue;
    private String whyUseCar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getNoOfFamMembers() {
        return noOfFamMembers;
    }

    public void setNoOfFamMembers(String noOfFamMembers) {
        this.noOfFamMembers = noOfFamMembers;
    }

    public String getBrandedPerson() {
        return brandedPerson;
    }

    public void setBrandedPerson(String brandedPerson) {
        this.brandedPerson = brandedPerson;
    }

    public String getHowLongUseVehicle() {
        return howLongUseVehicle;
    }

    public void setHowLongUseVehicle(String howLongUseVehicle) {
        this.howLongUseVehicle = howLongUseVehicle;
    }

    public String getConsiderMoneySpendOnFuel() {
        return considerMoneySpendOnFuel;
    }

    public void setConsiderMoneySpendOnFuel(String considerMoneySpendOnFuel) {
        this.considerMoneySpendOnFuel = considerMoneySpendOnFuel;
    }

    public String getAvgKmsPerDriveMonth() {
        return avgKmsPerDriveMonth;
    }

    public void setAvgKmsPerDriveMonth(String avgKmsPerDriveMonth) {
        this.avgKmsPerDriveMonth = avgKmsPerDriveMonth;
    }

    public String getConsiderResaleValue() {
        return considerResaleValue;
    }

    public void setConsiderResaleValue(String considerResaleValue) {
        this.considerResaleValue = considerResaleValue;
    }

    public String getWhyUseCar() {
        return whyUseCar;
    }

    public void setWhyUseCar(String whyUseCar) {
        this.whyUseCar = whyUseCar;
    }
}
