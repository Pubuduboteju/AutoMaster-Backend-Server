package com.ragul.car.Controller;

import com.ragul.car.Model.*;
import com.ragul.car.Service.CarService;
import com.ragul.car.Service.FileStorageService;
import com.ragul.car.Service.UserCommentsService;
import com.ragul.car.Service.VehicleNewsService;
import com.ragul.car.payload.ApiResponse;
import com.ragul.car.payload.UploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
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

    @GetMapping("/")
    public ResponseEntity<ApiResponse<List<Car>>> findAll() {
        return new ResponseEntity<>(new ApiResponse<>(carService.findAll()), HttpStatus.OK);
    }

    @GetMapping("/onStartData")
    public ResponseEntity<ApiResponse<List<Dimensions>>> findAllData() {
        return new ResponseEntity<>(new ApiResponse<>(carService.findAllData()), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Car>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(new ApiResponse<>(carService.findCarById(id)), HttpStatus.OK);
    }

    @GetMapping("/dimensions{id}")
    public ResponseEntity<ApiResponse<Dimensions>> findCarDimensionsById(@PathVariable Long id) {
        return new ResponseEntity<>(new ApiResponse<>(carService.findCarDimensionsById(id)), HttpStatus.OK);
    }


    @GetMapping("")
    public ResponseEntity<ApiResponse<Car>> getCarById(@RequestParam Long id){
        Car car = carService.findCarById(id);
        return new ResponseEntity<>(new ApiResponse<>(car), HttpStatus.OK);

    }

    @GetMapping("/getAllVehicleNews")
    public ResponseEntity<ApiResponse<List<VehicleNews>>> findAllVehicleNews() {
        return new ResponseEntity<>(new ApiResponse<>(vehicleNewsService.findAll()), HttpStatus.OK);
    }

    @PostMapping("/saveGeneralUserMessage")
    public ResponseEntity<ApiResponse<GeneralUserMessage>> saveGeneralUserMessage(@RequestBody GeneralUserMessage generalUserMessage){
        try{
            carService.saveGeneralUserMessage(generalUserMessage);
            return  new ResponseEntity<>(new ApiResponse<>(generalUserMessage), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(generalUserMessage), HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/getAllUserComments")
    public ResponseEntity<ApiResponse<List<UserComments>>> findAllUserComments() {
        return new ResponseEntity<>(new ApiResponse<>(userCommentsService.findAllUserComments()), HttpStatus.OK);
    }

    @PostMapping("/saveServiceRequestAppointment")
    public ResponseEntity<ApiResponse<ServiceAppointment>> saveServiceRequestAppointment(@RequestBody ServiceAppointment serviceAppointment){
        try{
            carService.saveServiceRequestAppointment(serviceAppointment);
            return  new ResponseEntity<>(new ApiResponse<>(serviceAppointment), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(serviceAppointment), HttpStatus.CONFLICT);
        }
    }

}
