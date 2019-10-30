package com.ragul.car.Repository;

import com.ragul.car.Model.VehicleNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleNewsRepository extends JpaRepository<VehicleNews, Long> {
    VehicleNews findFirstById(Long id);
}
