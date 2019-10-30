package com.ragul.car.Service;

import com.ragul.car.Model.UserCars;
import com.ragul.car.Repository.UserCarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCarsService {
    @Autowired
    UserCarsRepository userCarsRepository;

    public void saveUserCars(UserCars userCars) {
        userCarsRepository.save(userCars);
    }

    public List<UserCars> findAll() {
        return userCarsRepository.findAll();
    }

    public UserCars findCarById(Long id){
        return userCarsRepository.findFirstById(id);
    }

    public void updateUserCars(UserCars userCars){
        UserCars retrievedUserCarFromDb = userCarsRepository.findFirstById(userCars.getId());
        userCars.setId(retrievedUserCarFromDb.getId());
        userCarsRepository.save(userCars);
    }

    public void deleteUserCarById(Long id){ userCarsRepository.deleteById(id);}
}
