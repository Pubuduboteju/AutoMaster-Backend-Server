package com.ragul.car.Controller;


import com.ragul.car.Model.UserCars;
import com.ragul.car.Service.FileStorageService;
import com.ragul.car.Service.UserCarsService;
import com.ragul.car.payload.ApiResponse;
import com.ragul.car.payload.UserCarsUploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/userCars")
public class UserCarsController {
    @Autowired
    FileStorageService fileStorageService;
    @Autowired
    UserCarsService userCarsService;

    @PostMapping("/registerUserCars")
    public ResponseEntity<ApiResponse<UserCarsUploadFileResponse>> uploadFile(@RequestParam("file") MultipartFile file,
                                                                      @RequestParam("userName") String userName,
                                                                      @RequestParam("vehicleModel") String vehicleModel,
                                                                      @RequestParam("vehicleMake") String vehicleMake,
                                                                      @RequestParam("modelYear") Integer modelYear,
                                                                      @RequestParam("bodyType") String bodyType,
                                                                      @RequestParam("engineCapacity") Integer engineCapacity,
                                                                      @RequestParam("transmission") String transmission,
                                                                      @RequestParam("fuelType") String fuelType,
                                                                      @RequestParam("chassisNumber") String chassisNumber,
                                                                      @RequestParam("vehicleNumber") String vehicleNumber,
                                                                      @RequestParam("registeredYear") Integer registeredYear,
                                                                      @RequestParam("currentMileage") Integer currentMileage,
                                                                      @RequestParam("lastEngineOilChange") Integer lastEngineOilChange,
                                                                      @RequestParam("lastEngineOilFilterChange") Integer lastEngineOilFilterChange,
                                                                      @RequestParam("lastGearOilChange") Integer lastGearOilChange) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/downloadFile/")
                .path(fileName)
                .toUriString();

        UserCars userCars = new UserCars();
        userCars.setUserName(userName);
        userCars.setVehicleModel(vehicleModel);
        userCars.setVehicleMake(vehicleMake);
        userCars.setModelYear(modelYear);
        userCars.setBodyType(bodyType);
        userCars.setEngineCapacity(engineCapacity);
        userCars.setTransmission(transmission);
        userCars.setFuelType(fuelType);
        userCars.setChassisNumber(chassisNumber);
        userCars.setVehicleNumber(vehicleNumber);
        userCars.setRegisteredYear(registeredYear);
        userCars.setCurrentMileage(currentMileage);
        userCars.setLastEngineOilChange(lastEngineOilChange);
        userCars.setLastEngineOilFilterChange(lastEngineOilFilterChange);
        userCars.setLastGearOilChange(lastGearOilChange);
        userCars.setImage(fileDownloadUri);
        userCarsService.saveUserCars(userCars);
        UserCarsUploadFileResponse userCarsUploadFileResponse = new UserCarsUploadFileResponse(fileName,
                userName,
                vehicleModel,
                vehicleMake,
                modelYear,
                bodyType,
                engineCapacity,
                transmission,
                fuelType,
                chassisNumber,
                vehicleNumber,
                registeredYear,
                currentMileage,
                lastEngineOilChange,
                lastEngineOilFilterChange,
                lastGearOilChange,
                fileDownloadUri,
                file.getContentType(),
                file.getSize());

        return new ResponseEntity<>(new ApiResponse<>(userCarsUploadFileResponse), HttpStatus.OK);


    }

    @GetMapping("/getAllUserCars")
    public ResponseEntity<ApiResponse<List<UserCars>>> findAll() {
        return new ResponseEntity<>(new ApiResponse<>(userCarsService.findAll()), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserCars>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(new ApiResponse<>(userCarsService.findCarById(id)), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<ApiResponse<UserCars>> getCarById(@RequestParam Long id){
        UserCars userCars = userCarsService.findCarById(id);
        return new ResponseEntity<>(new ApiResponse<>(userCars), HttpStatus.OK);

    }

    @PostMapping("/updateUserCars")
    public ResponseEntity<ApiResponse<UserCars>> updateUserCars(@RequestBody UserCars userCars){
        try{
            userCarsService.updateUserCars(userCars);
            return  new ResponseEntity<>(new ApiResponse<>(userCars), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(userCars), HttpStatus.CONFLICT);
        }
    }

    @PostMapping(value ="/deleteUserCar{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Long>> deleteUserCar(@RequestParam Long id){
//        UserCars userCars = userCarsService.deleteUserCarById(id);
//        try{
//           UserCars userCars =  userCarsService.deleteUserCarById(id);
        userCarsService.deleteUserCarById(id);
            return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
//        }catch (Exception ex){
//            return  new ResponseEntity<>(new ApiResponse<>(userCars), HttpStatus.CONFLICT);
//        }
    }
}
