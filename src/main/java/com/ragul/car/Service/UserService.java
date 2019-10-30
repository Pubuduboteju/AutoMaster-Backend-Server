package com.ragul.car.Service;

import com.ragul.car.Model.User;
import com.ragul.car.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

//    public User findUserById(Long id){
//        return userRepository.findFirstById(id);
//    }
//
//    public User findUserByUserName(String userName){
//        return userRepository.findUserByUserName(userName);
//    }
}
