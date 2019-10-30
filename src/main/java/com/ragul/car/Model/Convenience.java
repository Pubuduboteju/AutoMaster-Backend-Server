package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Convenience")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Convenience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private Boolean frontRearCupHolders;
    private Boolean digitalClock;
    private Boolean accessoryPowerOutlet;
    private Boolean cruiseControl;
    private Boolean keylessEntry;
    private Boolean pushButtonStart;
    private Boolean smartKeySystem;
    private Boolean powerMirrors;
    private Boolean antiGlareMiddleMirror;
    private Boolean centerLock;
    private Boolean readingLights;

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

    public Boolean getFrontRearCupHolders() {
        return frontRearCupHolders;
    }

    public void setFrontRearCupHolders(Boolean frontRearCupHolders) {
        this.frontRearCupHolders = frontRearCupHolders;
    }

    public Boolean getDigitalClock() {
        return digitalClock;
    }

    public void setDigitalClock(Boolean digitalClock) {
        this.digitalClock = digitalClock;
    }

    public Boolean getAccessoryPowerOutlet() {
        return accessoryPowerOutlet;
    }

    public void setAccessoryPowerOutlet(Boolean accessoryPowerOutlet) {
        this.accessoryPowerOutlet = accessoryPowerOutlet;
    }

    public Boolean getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(Boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public Boolean getKeylessEntry() {
        return keylessEntry;
    }

    public void setKeylessEntry(Boolean keylessEntry) {
        this.keylessEntry = keylessEntry;
    }

    public Boolean getPushButtonStart() {
        return pushButtonStart;
    }

    public void setPushButtonStart(Boolean pushButtonStart) {
        this.pushButtonStart = pushButtonStart;
    }

    public Boolean getSmartKeySystem() {
        return smartKeySystem;
    }

    public void setSmartKeySystem(Boolean smartKeySystem) {
        this.smartKeySystem = smartKeySystem;
    }

    public Boolean getPowerMirrors() {
        return powerMirrors;
    }

    public void setPowerMirrors(Boolean powerMirrors) {
        this.powerMirrors = powerMirrors;
    }

    public Boolean getAntiGlareMiddleMirror() {
        return antiGlareMiddleMirror;
    }

    public void setAntiGlareMiddleMirror(Boolean antiGlareMiddleMirror) {
        this.antiGlareMiddleMirror = antiGlareMiddleMirror;
    }

    public Boolean getCenterLock() {
        return centerLock;
    }

    public void setCenterLock(Boolean centerLock) {
        this.centerLock = centerLock;
    }

    public Boolean getReadingLights() {
        return readingLights;
    }

    public void setReadingLights(Boolean readingLights) {
        this.readingLights = readingLights;
    }
}
