package com.ragul.car.Service;

import com.ragul.car.Model.VehicleNews;
import com.ragul.car.Repository.VehicleNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleNewsService {
    @Autowired
    VehicleNewsRepository vehicleNewsRepository;

    public void saveVehicleNews(VehicleNews vehicleNews) {
        vehicleNewsRepository.save(vehicleNews);
    }

    public List<VehicleNews> findAll() {
        return vehicleNewsRepository.findAll();
    }

    public VehicleNews findVehicleNewsById(Long id){
        return vehicleNewsRepository.findFirstById(id);
    }

    public void updateVehicleNews(VehicleNews vehicleNews){
        VehicleNews retrievedVehicleNewsFromDb = vehicleNewsRepository.findFirstById(vehicleNews.getId());
        vehicleNews.setId(retrievedVehicleNewsFromDb.getId());
        vehicleNewsRepository.save(vehicleNews);
    }

    public void deleteVehicleNewsById(Long id){ vehicleNewsRepository.deleteById(id);}
}
