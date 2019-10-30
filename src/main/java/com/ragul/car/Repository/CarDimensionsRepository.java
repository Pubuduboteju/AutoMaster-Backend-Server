package com.ragul.car.Repository;

import com.ragul.car.Model.Dimensions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDimensionsRepository extends JpaRepository<Dimensions,Long> {
    Dimensions findFirstById(Long id);
}
