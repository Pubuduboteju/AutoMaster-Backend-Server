package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Mechanical")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Mechanical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private Boolean stabilizerBar;
    private Boolean macphersonGasStruts;
    private Boolean torsionBeamType;
    private Boolean VSC;
    private Boolean TRAC;
    private Boolean HAC;
    private Boolean variableValveTimingWithIntelligence;
    private Boolean ECOMode;
    private Boolean EVMode;
    private Boolean exhaustHeatRecoverySystem;
    private Boolean frontDisc;
    private Boolean rearDisc;
    private Boolean rearDrum;
    private Boolean CVT;
    private Boolean toyotaSuperCVT;
    private Boolean manual;
    private String tyreSize;
    private Boolean alloyWheels;

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

    public Boolean getStabilizerBar() {
        return stabilizerBar;
    }

    public void setStabilizerBar(Boolean stabilizerBar) {
        this.stabilizerBar = stabilizerBar;
    }

    public Boolean getMacphersonGasStruts() {
        return macphersonGasStruts;
    }

    public void setMacphersonGasStruts(Boolean macphersonGasStruts) {
        this.macphersonGasStruts = macphersonGasStruts;
    }

    public Boolean getTorsionBeamType() {
        return torsionBeamType;
    }

    public void setTorsionBeamType(Boolean torsionBeamType) {
        this.torsionBeamType = torsionBeamType;
    }

    public Boolean getVSC() {
        return VSC;
    }

    public void setVSC(Boolean VSC) {
        this.VSC = VSC;
    }

    public Boolean getTRAC() {
        return TRAC;
    }

    public void setTRAC(Boolean TRAC) {
        this.TRAC = TRAC;
    }

    public Boolean getHAC() {
        return HAC;
    }

    public void setHAC(Boolean HAC) {
        this.HAC = HAC;
    }

    public Boolean getVariableValveTimingWithIntelligence() {
        return variableValveTimingWithIntelligence;
    }

    public void setVariableValveTimingWithIntelligence(Boolean variableValveTimingWithIntelligence) {
        this.variableValveTimingWithIntelligence = variableValveTimingWithIntelligence;
    }

    public Boolean getECOMode() {
        return ECOMode;
    }

    public void setECOMode(Boolean ECOMode) {
        this.ECOMode = ECOMode;
    }

    public Boolean getEVMode() {
        return EVMode;
    }

    public void setEVMode(Boolean EVMode) {
        this.EVMode = EVMode;
    }

    public Boolean getExhaustHeatRecoverySystem() {
        return exhaustHeatRecoverySystem;
    }

    public void setExhaustHeatRecoverySystem(Boolean exhaustHeatRecoverySystem) {
        this.exhaustHeatRecoverySystem = exhaustHeatRecoverySystem;
    }

    public Boolean getFrontDisc() {
        return frontDisc;
    }

    public void setFrontDisc(Boolean frontDisc) {
        this.frontDisc = frontDisc;
    }

    public Boolean getRearDisc() {
        return rearDisc;
    }

    public void setRearDisc(Boolean rearDisc) {
        this.rearDisc = rearDisc;
    }

    public Boolean getRearDrum() {
        return rearDrum;
    }

    public void setRearDrum(Boolean rearDrum) {
        this.rearDrum = rearDrum;
    }

    public Boolean getCVT() {
        return CVT;
    }

    public void setCVT(Boolean CVT) {
        this.CVT = CVT;
    }

    public Boolean getToyotaSuperCVT() {
        return toyotaSuperCVT;
    }

    public void setToyotaSuperCVT(Boolean toyotaSuperCVT) {
        this.toyotaSuperCVT = toyotaSuperCVT;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public String getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(String tyreSize) {
        this.tyreSize = tyreSize;
    }

    public Boolean getAlloyWheels() {
        return alloyWheels;
    }

    public void setAlloyWheels(Boolean alloyWheels) {
        this.alloyWheels = alloyWheels;
    }
}
