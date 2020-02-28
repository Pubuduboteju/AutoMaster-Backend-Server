package com.ragul.car.Repository;

import com.ragul.car.Model.CarFeatures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarFeaturesRepository extends JpaRepository<CarFeatures, String> {
    CarFeatures findCarFeaturesByVehicleModel(String vehicleModel);
}
