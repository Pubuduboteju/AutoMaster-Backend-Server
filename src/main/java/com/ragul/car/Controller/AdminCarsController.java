package com.ragul.car.Controller;


import com.ragul.car.Model.Car;
import com.ragul.car.Model.GeneralUserMessage;
import com.ragul.car.Model.ServiceAppointment;
import com.ragul.car.Model.VehicleNews;
import com.ragul.car.Service.CarService;
import com.ragul.car.Service.FileStorageService;
import com.ragul.car.Service.UserCommentsService;
import com.ragul.car.Service.VehicleNewsService;
import com.ragul.car.payload.ApiResponse;
import com.ragul.car.payload.UploadFileResponse;
import com.ragul.car.payload.VehicleNewsUploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/adminCars")
public class AdminCarsController {
    @Autowired
    FileStorageService fileStorageService;
    @Autowired
    CarService carService;
    @Autowired
    VehicleNewsService vehicleNewsService;
    @Autowired
    UserCommentsService userCommentsService;
    @PostMapping("")
    public ResponseEntity<ApiResponse<UploadFileResponse>> uploadFile(@RequestParam("file") MultipartFile file,
                                                                      @RequestParam("vehicleModel") String vehicleModel,
                                                                      @RequestParam("vehicleMake") String vehicleMake,
                                                                      @RequestParam("trim_edition") String trim_edition,
                                                                      @RequestParam("modelYear") Integer modelYear,
                                                                      @RequestParam("bodyType") String bodyType,
                                                                      @RequestParam("engineCapacity") Integer engineCapacity,
                                                                      @RequestParam("transmission") String transmission,
                                                                      @RequestParam("fuelType") String fuelType) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/downloadFile/")
                .path(fileName)
                .toUriString();

        Car car = new Car();
        car.setVehicleModel(vehicleModel);
        car.setVehicleMake(vehicleMake);
        car.setTrim_edition(trim_edition);
        car.setModelYear(modelYear);
        car.setBodyType(bodyType);
        car.setEngineCapacity(engineCapacity);
        car.setTransmission(transmission);
        car.setFuelType(fuelType);
        car.setImage(fileDownloadUri);
        carService.save(car);
        UploadFileResponse uploadFileResponse = new UploadFileResponse(fileName,
                vehicleModel,
                vehicleMake,
                trim_edition,
                modelYear,
                bodyType,
                engineCapacity,
                transmission,
                fuelType,
                fileDownloadUri,
                file.getContentType(),
                file.getSize());

        return new ResponseEntity<>(new ApiResponse<>(uploadFileResponse), HttpStatus.OK);


    }

    @PostMapping("/saveVehicleNews")
    public ResponseEntity<ApiResponse<VehicleNewsUploadFileResponse>> uploadFile(@RequestParam("file") MultipartFile file,
                                                                                 @RequestParam("title") String title,
                                                                                 @RequestParam("subTitle") String subTitle,
                                                                                 @RequestParam("description") String description,
                                                                                 @RequestParam("newsDate") String newsDate) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/downloadFile/")
                .path(fileName)
                .toUriString();

        VehicleNews vehicleNews = new VehicleNews();
        vehicleNews.setTitle(title);
        vehicleNews.setSubTitle(subTitle);
        vehicleNews.setDescription(description);
        vehicleNews.setNewsDate(newsDate);
        vehicleNews.setImage(fileDownloadUri);
       vehicleNewsService.saveVehicleNews(vehicleNews);
        VehicleNewsUploadFileResponse vehicleNewsUploadFileResponse = new VehicleNewsUploadFileResponse(fileName,
                title,
                subTitle,
                description,
                newsDate,
                fileDownloadUri,
                file.getContentType(),
                file.getSize());

        return new ResponseEntity<>(new ApiResponse<>(vehicleNewsUploadFileResponse), HttpStatus.OK);


    }


    @GetMapping("/")
    public ResponseEntity<ApiResponse<List<Car>>> findAll() {
        return new ResponseEntity<>(new ApiResponse<>(carService.findAll()), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Car>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(new ApiResponse<>(carService.findCarById(id)), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<ApiResponse<Car>> getCarById(@RequestParam Long id){
        Car car = carService.findCarById(id);
        return new ResponseEntity<>(new ApiResponse<>(car), HttpStatus.OK);

    }

    @PostMapping("/updateAdminCars")
    public ResponseEntity<ApiResponse<Car>> updateAdminCars(@RequestBody Car car){
        try{
            carService.updateAdminCars(car);
            return  new ResponseEntity<>(new ApiResponse<>(car), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(car), HttpStatus.CONFLICT);
        }
    }

    @PostMapping(value ="/deleteAdminCar{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Long>> deleteAdminCar(@RequestParam Long id){
//        UserCars userCars = userCarsService.deleteUserCarById(id);
//        try{
//           UserCars userCars =  userCarsService.deleteUserCarById(id);
        carService.deleteAdminCarById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
//        }catch (Exception ex){
//            return  new ResponseEntity<>(new ApiResponse<>(userCars), HttpStatus.CONFLICT);
//        }
    }

    @PostMapping(value ="/deleteVehicleNews{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Long>> deleteVehicleNews(@RequestParam Long id){
        vehicleNewsService.deleteVehicleNewsById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
    }

    @GetMapping("/getAllGeneralUserMessages")
    public ResponseEntity<ApiResponse<List<GeneralUserMessage>>> findAllGeneralUserMessages() {
        return new ResponseEntity<>(new ApiResponse<>(carService.findAllGeneralUserMessages()), HttpStatus.OK);
    }

    @PostMapping("/updateGeneralUserMessage")
    public ResponseEntity<ApiResponse<GeneralUserMessage>>  updateGeneralUserMessage(@RequestBody GeneralUserMessage generalUserMessage){
        try{
            carService.updateGeneralUserMessage(generalUserMessage);
            return  new ResponseEntity<>(new ApiResponse<>(generalUserMessage), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(generalUserMessage), HttpStatus.CONFLICT);
        }
    }

    @PostMapping(value ="/deleteGeneralUserMessage{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Long>> deleteGeneralUserMessage(@RequestParam Long id){
        carService.deleteGeneralUserMessageById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
    }

    @PostMapping(value ="/deleteUserComments{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Integer>> deleteUserComments(@RequestParam Integer id){
        userCommentsService.deleteUserCommentsById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
    }

    @GetMapping("/getAllServiceAppointments")
    public ResponseEntity<ApiResponse<List<ServiceAppointment>>> findAllServiceAppointments() {
        return new ResponseEntity<>(new ApiResponse<>(carService.findAllServiceAppointments()), HttpStatus.OK);
    }

    @PostMapping(value ="/deleteServiceAppointment{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Long>> deleteServiceAppointment(@RequestParam Long id){
        carService.deleteServiceAppointmentById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
    }
}
