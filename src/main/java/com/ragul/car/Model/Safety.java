package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Safety")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Safety {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private Boolean frontSeatMountedSideAirbags;
    private Boolean anchorPointsForChildRestraintSeats;
    private Boolean frontAndRearSideCurtainAirbags;
    private Boolean childProtectorRearDoorLocks;
    private Boolean assistGrips;
    private Boolean driverKneeAirbag;
    private Boolean SRS;
    private Boolean frontPassengerAirbagStatusIndicator;
    private Boolean frontSeatCushionAirbags;

    private Boolean lowFuelWarningLight;
    private Boolean doorAjar;
    private Boolean frontDriverAndPassengerSeatbelt;
    private Boolean engineHeatWarnnig;
    private Boolean lowEngineOilLevel;
    private Boolean tirePressureMonitoringSystem;
    private Boolean keyRemindWarning;
    private Boolean headLampsOn;

    private Boolean EBD;
    private Boolean BA;
    private Boolean ABS;
    private Boolean TRAC;
    private Boolean VSC;
    private Boolean SST;

    private Boolean preCollisionSystemWithPedestrianDetection;
    private Boolean laneDepartureAlert;
    private Boolean blindSpotAssist;
    private Boolean autoHighBeam;

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

    public Boolean getFrontSeatMountedSideAirbags() {
        return frontSeatMountedSideAirbags;
    }

    public void setFrontSeatMountedSideAirbags(Boolean frontSeatMountedSideAirbags) {
        this.frontSeatMountedSideAirbags = frontSeatMountedSideAirbags;
    }

    public Boolean getAnchorPointsForChildRestraintSeats() {
        return anchorPointsForChildRestraintSeats;
    }

    public void setAnchorPointsForChildRestraintSeats(Boolean anchorPointsForChildRestraintSeats) {
        this.anchorPointsForChildRestraintSeats = anchorPointsForChildRestraintSeats;
    }

    public Boolean getFrontAndRearSideCurtainAirbags() {
        return frontAndRearSideCurtainAirbags;
    }

    public void setFrontAndRearSideCurtainAirbags(Boolean frontAndRearSideCurtainAirbags) {
        this.frontAndRearSideCurtainAirbags = frontAndRearSideCurtainAirbags;
    }

    public Boolean getChildProtectorRearDoorLocks() {
        return childProtectorRearDoorLocks;
    }

    public void setChildProtectorRearDoorLocks(Boolean childProtectorRearDoorLocks) {
        this.childProtectorRearDoorLocks = childProtectorRearDoorLocks;
    }

    public Boolean getAssistGrips() {
        return assistGrips;
    }

    public void setAssistGrips(Boolean assistGrips) {
        this.assistGrips = assistGrips;
    }

    public Boolean getDriverKneeAirbag() {
        return driverKneeAirbag;
    }

    public void setDriverKneeAirbag(Boolean driverKneeAirbag) {
        this.driverKneeAirbag = driverKneeAirbag;
    }

    public Boolean getSRS() {
        return SRS;
    }

    public void setSRS(Boolean SRS) {
        this.SRS = SRS;
    }

    public Boolean getFrontPassengerAirbagStatusIndicator() {
        return frontPassengerAirbagStatusIndicator;
    }

    public void setFrontPassengerAirbagStatusIndicator(Boolean frontPassengerAirbagStatusIndicator) {
        this.frontPassengerAirbagStatusIndicator = frontPassengerAirbagStatusIndicator;
    }

    public Boolean getFrontSeatCushionAirbags() {
        return frontSeatCushionAirbags;
    }

    public void setFrontSeatCushionAirbags(Boolean frontSeatCushionAirbags) {
        this.frontSeatCushionAirbags = frontSeatCushionAirbags;
    }

    public Boolean getLowFuelWarningLight() {
        return lowFuelWarningLight;
    }

    public void setLowFuelWarningLight(Boolean lowFuelWarningLight) {
        this.lowFuelWarningLight = lowFuelWarningLight;
    }

    public Boolean getDoorAjar() {
        return doorAjar;
    }

    public void setDoorAjar(Boolean doorAjar) {
        this.doorAjar = doorAjar;
    }

    public Boolean getFrontDriverAndPassengerSeatbelt() {
        return frontDriverAndPassengerSeatbelt;
    }

    public void setFrontDriverAndPassengerSeatbelt(Boolean frontDriverAndPassengerSeatbelt) {
        this.frontDriverAndPassengerSeatbelt = frontDriverAndPassengerSeatbelt;
    }

    public Boolean getEngineHeatWarnnig() {
        return engineHeatWarnnig;
    }

    public void setEngineHeatWarnnig(Boolean engineHeatWarnnig) {
        this.engineHeatWarnnig = engineHeatWarnnig;
    }

    public Boolean getLowEngineOilLevel() {
        return lowEngineOilLevel;
    }

    public void setLowEngineOilLevel(Boolean lowEngineOilLevel) {
        this.lowEngineOilLevel = lowEngineOilLevel;
    }

    public Boolean getTirePressureMonitoringSystem() {
        return tirePressureMonitoringSystem;
    }

    public void setTirePressureMonitoringSystem(Boolean tirePressureMonitoringSystem) {
        this.tirePressureMonitoringSystem = tirePressureMonitoringSystem;
    }

    public Boolean getKeyRemindWarning() {
        return keyRemindWarning;
    }

    public void setKeyRemindWarning(Boolean keyRemindWarning) {
        this.keyRemindWarning = keyRemindWarning;
    }

    public Boolean getHeadLampsOn() {
        return headLampsOn;
    }

    public void setHeadLampsOn(Boolean headLampsOn) {
        this.headLampsOn = headLampsOn;
    }

    public Boolean getEBD() {
        return EBD;
    }

    public void setEBD(Boolean EBD) {
        this.EBD = EBD;
    }

    public Boolean getBA() {
        return BA;
    }

    public void setBA(Boolean BA) {
        this.BA = BA;
    }

    public Boolean getABS() {
        return ABS;
    }

    public void setABS(Boolean ABS) {
        this.ABS = ABS;
    }

    public Boolean getTRAC() {
        return TRAC;
    }

    public void setTRAC(Boolean TRAC) {
        this.TRAC = TRAC;
    }

    public Boolean getVSC() {
        return VSC;
    }

    public void setVSC(Boolean VSC) {
        this.VSC = VSC;
    }

    public Boolean getSST() {
        return SST;
    }

    public void setSST(Boolean SST) {
        this.SST = SST;
    }

    public Boolean getPreCollisionSystemWithPedestrianDetection() {
        return preCollisionSystemWithPedestrianDetection;
    }

    public void setPreCollisionSystemWithPedestrianDetection(Boolean preCollisionSystemWithPedestrianDetection) {
        this.preCollisionSystemWithPedestrianDetection = preCollisionSystemWithPedestrianDetection;
    }

    public Boolean getLaneDepartureAlert() {
        return laneDepartureAlert;
    }

    public void setLaneDepartureAlert(Boolean laneDepartureAlert) {
        this.laneDepartureAlert = laneDepartureAlert;
    }

    public Boolean getBlindSpotAssist() {
        return blindSpotAssist;
    }

    public void setBlindSpotAssist(Boolean blindSpotAssist) {
        this.blindSpotAssist = blindSpotAssist;
    }

    public Boolean getAutoHighBeam() {
        return autoHighBeam;
    }

    public void setAutoHighBeam(Boolean autoHighBeam) {
        this.autoHighBeam = autoHighBeam;
    }
}
