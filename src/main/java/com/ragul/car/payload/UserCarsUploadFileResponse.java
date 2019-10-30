package com.ragul.car.payload;

public class UserCarsUploadFileResponse {
    private String fileName;
    private String userName;
    private String vehicleModel;
    private String vehicleMake;
    private Integer modelYear;
    private String bodyType;
    private Integer engineCapacity;
    private String transmission;
    private String fuelType;
    private String chassisNumber;
    private String vehicleNumber;
    private  Integer registeredYear;
    private Integer currentMileage;
    private Integer lastEngineOilChange;
    private Integer lastEngineOilFilterChange;
    private Integer lastGearOilChange;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UserCarsUploadFileResponse(String fileName,String userName, String vehicleModel,String vehicleMake, Integer modelYear, String bodyType, Integer engineCapacity, String transmission, String fuelType, String chassisNumber,String vehicleNumber,Integer registeredYear,Integer currentMileage, Integer lastEngineOilChange, Integer lastEngineOilFilterChange,Integer lastGearOilChange, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.userName = userName;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.modelYear = modelYear;
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.chassisNumber = chassisNumber;
        this.vehicleNumber = vehicleNumber;
        this.registeredYear = registeredYear;
        this.currentMileage = currentMileage;
        this.lastEngineOilChange = lastEngineOilChange;
        this.lastEngineOilFilterChange = lastEngineOilFilterChange;
        this.lastGearOilChange = lastGearOilChange;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getRegisteredYear() {
        return registeredYear;
    }

    public void setRegisteredYear(Integer registeredYear) {
        this.registeredYear = registeredYear;
    }

    public Integer getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(Integer currentMileage) {
        this.currentMileage = currentMileage;
    }

    public Integer getLastEngineOilChange() {
        return lastEngineOilChange;
    }

    public void setLastEngineOilChange(Integer lastEngineOilChange) {
        this.lastEngineOilChange = lastEngineOilChange;
    }

    public Integer getLastEngineOilFilterChange() {
        return lastEngineOilFilterChange;
    }

    public void setLastEngineOilFilterChange(Integer lastEngineOilFilterChange) {
        this.lastEngineOilFilterChange = lastEngineOilFilterChange;
    }

    public Integer getLastGearOilChange() {
        return lastGearOilChange;
    }

    public void setLastGearOilChange(Integer lastGearOilChange) {
        this.lastGearOilChange = lastGearOilChange;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
