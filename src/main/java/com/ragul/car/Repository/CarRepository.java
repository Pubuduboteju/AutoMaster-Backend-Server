package com.ragul.car.Repository;

import com.ragul.car.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
     Car findFirstById(Long id);
}
