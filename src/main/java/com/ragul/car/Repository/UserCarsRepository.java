package com.ragul.car.Repository;

import com.ragul.car.Model.UserCars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCarsRepository extends JpaRepository<UserCars,Long> {
    UserCars findFirstById(Long id);
}
