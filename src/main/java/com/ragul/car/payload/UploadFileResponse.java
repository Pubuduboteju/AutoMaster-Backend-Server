package com.ragul.car.payload;


public class UploadFileResponse {
    private String fileName;
//    private String insectName;
//    private String description;
    private String vehicleModel;
    private String vehicleMake;
    private String trim_edition;
    private Integer modelYear;
    private String bodyType;
    private Integer engineCapacity;
    private String transmission;
    private String fuelType;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String vehicleModel,String vehicleMake, String trim_edition, Integer modelYear, String bodyType, Integer engineCapacity, String transmission, String fuelType, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
//        this.insectName = insectName;
//        this.description = description;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.trim_edition =trim_edition;
        this.modelYear = modelYear;
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
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

    public String getTrim_edition() {
        return trim_edition;
    }

    public void setTrim_edition(String trim_edition) {
        this.trim_edition = trim_edition;
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

//    public String getInsectName() {
//        return insectName;
//    }
//
//    public void setInsectName(String insectName) {
//        this.insectName = insectName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
