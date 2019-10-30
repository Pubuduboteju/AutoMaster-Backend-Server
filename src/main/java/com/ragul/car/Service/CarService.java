package com.ragul.car.Service;

import com.ragul.car.Model.Car;
import com.ragul.car.Model.Dimensions;
import com.ragul.car.Model.GeneralUserMessage;
import com.ragul.car.Model.ServiceAppointment;
import com.ragul.car.Repository.CarDimensionsRepository;
import com.ragul.car.Repository.CarRepository;
import com.ragul.car.Repository.GeneralUserMessageRepository;
import com.ragul.car.Repository.ServiceAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;
    @Autowired
    GeneralUserMessageRepository generalUserMessageRepository;
    @Autowired
    ServiceAppointmentRepository serviceAppointmentRepository;
    @Autowired
    CarDimensionsRepository carDimensionsRepository;

    public void save(Car car) {
        carRepository.save(car);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }
    public List<Dimensions> findAllData() {
        return carDimensionsRepository.findAll();
    }

    public Car findCarById(Long id){
        return carRepository.findFirstById(id);
    }

    public Dimensions findCarDimensionsById(Long id){
        return carDimensionsRepository.findFirstById(id);
    }

    public void updateAdminCars(Car car){
        Car retrievedCarFromDb = carRepository.findFirstById(car.getId());
        car.setId(retrievedCarFromDb.getId());
        carRepository.save(car);
    }

    public void deleteAdminCarById(Long id){ carRepository.deleteById(id);}

    public void saveGeneralUserMessage(GeneralUserMessage generalUserMessage) {
        generalUserMessageRepository.save(generalUserMessage);
    }

    public List<GeneralUserMessage> findAllGeneralUserMessages() {
        return  generalUserMessageRepository.findAll();
    }

    public GeneralUserMessage findGeneralUserMessageById(Long id){
        return generalUserMessageRepository.findFirstById(id);
    }

    public void updateGeneralUserMessage(GeneralUserMessage generalUserMessage){
        GeneralUserMessage retrievedGeneralUserMessageFromDb = generalUserMessageRepository.findFirstById(generalUserMessage.getId());
        generalUserMessage.setId(retrievedGeneralUserMessageFromDb.getId());
        generalUserMessageRepository.save(generalUserMessage);
    }

    public void deleteGeneralUserMessageById(Long id){ generalUserMessageRepository.deleteById(id);}

    public void saveServiceRequestAppointment(ServiceAppointment serviceAppointment) {
        serviceAppointmentRepository.save(serviceAppointment);
    }

    public List<ServiceAppointment> findAllServiceAppointments() {
        return  serviceAppointmentRepository.findAll();
    }

    public void deleteServiceAppointmentById(Long id){ serviceAppointmentRepository.deleteById(id);}

}
