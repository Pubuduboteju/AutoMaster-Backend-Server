package com.ragul.car.Service;

import com.ragul.car.Model.UserComments;
import com.ragul.car.Repository.UserCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommentsService {
    @Autowired
    UserCommentsRepository userCommentsRepository;

    public void saveUserComments(UserComments userComments) {
        userCommentsRepository.save(userComments);
    }

    public List<UserComments> findAllUserComments() {
        return userCommentsRepository.findAll();
    }

    public UserComments findCarById(Integer id){
        return userCommentsRepository.findFirstById(id);
    }

    public void deleteUserCommentsById(Integer id){ userCommentsRepository.deleteById(id);}

//    public List<User> findAll() {
//        return userCommentsRepository.findAll();
//    }

//    public UserComments findUserById(Long id){
//        return userCommentsRepository.findFirstById(id);
//    }

//    public UserComments findUserCommentsByVehicleName(String vehicleName){
//        return userCommentsRepository.findUserCommentsByVehicleName(vehicleName);
//    }
}
