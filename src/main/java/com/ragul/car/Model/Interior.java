package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Interior")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Interior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private Boolean syntheticLeatherWrappedSteeringWheel;
    private Boolean teakFinishDashboard;
    private Boolean tiltTelescopicSteeringWheel;
    private Boolean touchTracerSteeringWheelControls;
    private Boolean dualZoneClimateControl;
    private Boolean automaticTemperatureControl;
    private Boolean cabinAirFilter;
    private Boolean rearSeatHeaterDucts;
    private Boolean airConditioningWithBacteriaDestroying;

    private Boolean leatherSeats;
    private Boolean electricSeatAdjusting;
    private Boolean seatLambaAdjusting;
    private Boolean heatedFrontSeats;
    private Boolean rearAdjustableSeats;
    private Boolean driverSeatHeightAdjustable;
    private Boolean rearSeatArmRest;

    private Boolean UVCutGlassProtection;
    private Boolean allAutoPowerWindows;
    private Boolean TFTDisplay;
    private Boolean dualTripOdometer;
    private Boolean outsideTemperatureGauge;
    private Boolean backupCamera;

    private Boolean audioSystem;
    private Boolean USBAudioInput;
    private Boolean antennaSharkFinType;
    private Boolean fourSpeakers;
    private Boolean sixSpeakers;
    private Boolean frontCentreConsoleBox;
    private Boolean driverAndPassengerOpeningDoorPockets;
    private Boolean frontPassengerRearSeatbackPocket;
    private Boolean frontCupholders;
    private Boolean rearCupholders;

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

    public Boolean getSyntheticLeatherWrappedSteeringWheel() {
        return syntheticLeatherWrappedSteeringWheel;
    }

    public void setSyntheticLeatherWrappedSteeringWheel(Boolean syntheticLeatherWrappedSteeringWheel) {
        this.syntheticLeatherWrappedSteeringWheel = syntheticLeatherWrappedSteeringWheel;
    }

    public Boolean getTeakFinishDashboard() {
        return teakFinishDashboard;
    }

    public void setTeakFinishDashboard(Boolean teakFinishDashboard) {
        this.teakFinishDashboard = teakFinishDashboard;
    }

    public Boolean getTiltTelescopicSteeringWheel() {
        return tiltTelescopicSteeringWheel;
    }

    public void setTiltTelescopicSteeringWheel(Boolean tiltTelescopicSteeringWheel) {
        this.tiltTelescopicSteeringWheel = tiltTelescopicSteeringWheel;
    }

    public Boolean getTouchTracerSteeringWheelControls() {
        return touchTracerSteeringWheelControls;
    }

    public void setTouchTracerSteeringWheelControls(Boolean touchTracerSteeringWheelControls) {
        this.touchTracerSteeringWheelControls = touchTracerSteeringWheelControls;
    }

    public Boolean getDualZoneClimateControl() {
        return dualZoneClimateControl;
    }

    public void setDualZoneClimateControl(Boolean dualZoneClimateControl) {
        this.dualZoneClimateControl = dualZoneClimateControl;
    }

    public Boolean getAutomaticTemperatureControl() {
        return automaticTemperatureControl;
    }

    public void setAutomaticTemperatureControl(Boolean automaticTemperatureControl) {
        this.automaticTemperatureControl = automaticTemperatureControl;
    }

    public Boolean getCabinAirFilter() {
        return cabinAirFilter;
    }

    public void setCabinAirFilter(Boolean cabinAirFilter) {
        this.cabinAirFilter = cabinAirFilter;
    }

    public Boolean getRearSeatHeaterDucts() {
        return rearSeatHeaterDucts;
    }

    public void setRearSeatHeaterDucts(Boolean rearSeatHeaterDucts) {
        this.rearSeatHeaterDucts = rearSeatHeaterDucts;
    }

    public Boolean getAirConditioningWithBacteriaDestroying() {
        return airConditioningWithBacteriaDestroying;
    }

    public void setAirConditioningWithBacteriaDestroying(Boolean airConditioningWithBacteriaDestroying) {
        this.airConditioningWithBacteriaDestroying = airConditioningWithBacteriaDestroying;
    }

    public Boolean getLeatherSeats() {
        return leatherSeats;
    }

    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public Boolean getElectricSeatAdjusting() {
        return electricSeatAdjusting;
    }

    public void setElectricSeatAdjusting(Boolean electricSeatAdjusting) {
        this.electricSeatAdjusting = electricSeatAdjusting;
    }

    public Boolean getSeatLambaAdjusting() {
        return seatLambaAdjusting;
    }

    public void setSeatLambaAdjusting(Boolean seatLambaAdjusting) {
        this.seatLambaAdjusting = seatLambaAdjusting;
    }

    public Boolean getHeatedFrontSeats() {
        return heatedFrontSeats;
    }

    public void setHeatedFrontSeats(Boolean heatedFrontSeats) {
        this.heatedFrontSeats = heatedFrontSeats;
    }

    public Boolean getRearAdjustableSeats() {
        return rearAdjustableSeats;
    }

    public void setRearAdjustableSeats(Boolean rearAdjustableSeats) {
        this.rearAdjustableSeats = rearAdjustableSeats;
    }

    public Boolean getDriverSeatHeightAdjustable() {
        return driverSeatHeightAdjustable;
    }

    public void setDriverSeatHeightAdjustable(Boolean driverSeatHeightAdjustable) {
        this.driverSeatHeightAdjustable = driverSeatHeightAdjustable;
    }

    public Boolean getRearSeatArmRest() {
        return rearSeatArmRest;
    }

    public void setRearSeatArmRest(Boolean rearSeatArmRest) {
        this.rearSeatArmRest = rearSeatArmRest;
    }

    public Boolean getUVCutGlassProtection() {
        return UVCutGlassProtection;
    }

    public void setUVCutGlassProtection(Boolean UVCutGlassProtection) {
        this.UVCutGlassProtection = UVCutGlassProtection;
    }

    public Boolean getAllAutoPowerWindows() {
        return allAutoPowerWindows;
    }

    public void setAllAutoPowerWindows(Boolean allAutoPowerWindows) {
        this.allAutoPowerWindows = allAutoPowerWindows;
    }

    public Boolean getTFTDisplay() {
        return TFTDisplay;
    }

    public void setTFTDisplay(Boolean TFTDisplay) {
        this.TFTDisplay = TFTDisplay;
    }

    public Boolean getDualTripOdometer() {
        return dualTripOdometer;
    }

    public void setDualTripOdometer(Boolean dualTripOdometer) {
        this.dualTripOdometer = dualTripOdometer;
    }

    public Boolean getOutsideTemperatureGauge() {
        return outsideTemperatureGauge;
    }

    public void setOutsideTemperatureGauge(Boolean outsideTemperatureGauge) {
        this.outsideTemperatureGauge = outsideTemperatureGauge;
    }

    public Boolean getBackupCamera() {
        return backupCamera;
    }

    public void setBackupCamera(Boolean backupCamera) {
        this.backupCamera = backupCamera;
    }

    public Boolean getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(Boolean audioSystem) {
        this.audioSystem = audioSystem;
    }

    public Boolean getUSBAudioInput() {
        return USBAudioInput;
    }

    public void setUSBAudioInput(Boolean USBAudioInput) {
        this.USBAudioInput = USBAudioInput;
    }

    public Boolean getAntennaSharkFinType() {
        return antennaSharkFinType;
    }

    public void setAntennaSharkFinType(Boolean antennaSharkFinType) {
        this.antennaSharkFinType = antennaSharkFinType;
    }

    public Boolean getFourSpeakers() {
        return fourSpeakers;
    }

    public void setFourSpeakers(Boolean fourSpeakers) {
        this.fourSpeakers = fourSpeakers;
    }

    public Boolean getSixSpeakers() {
        return sixSpeakers;
    }

    public void setSixSpeakers(Boolean sixSpeakers) {
        this.sixSpeakers = sixSpeakers;
    }

    public Boolean getFrontCentreConsoleBox() {
        return frontCentreConsoleBox;
    }

    public void setFrontCentreConsoleBox(Boolean frontCentreConsoleBox) {
        this.frontCentreConsoleBox = frontCentreConsoleBox;
    }

    public Boolean getDriverAndPassengerOpeningDoorPockets() {
        return driverAndPassengerOpeningDoorPockets;
    }

    public void setDriverAndPassengerOpeningDoorPockets(Boolean driverAndPassengerOpeningDoorPockets) {
        this.driverAndPassengerOpeningDoorPockets = driverAndPassengerOpeningDoorPockets;
    }

    public Boolean getFrontPassengerRearSeatbackPocket() {
        return frontPassengerRearSeatbackPocket;
    }

    public void setFrontPassengerRearSeatbackPocket(Boolean frontPassengerRearSeatbackPocket) {
        this.frontPassengerRearSeatbackPocket = frontPassengerRearSeatbackPocket;
    }

    public Boolean getFrontCupholders() {
        return frontCupholders;
    }

    public void setFrontCupholders(Boolean frontCupholders) {
        this.frontCupholders = frontCupholders;
    }

    public Boolean getRearCupholders() {
        return rearCupholders;
    }

    public void setRearCupholders(Boolean rearCupholders) {
        this.rearCupholders = rearCupholders;
    }
}
