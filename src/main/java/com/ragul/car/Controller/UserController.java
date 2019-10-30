package com.ragul.car.Controller;

import com.ragul.car.Model.User;
import com.ragul.car.Service.UserService;
import com.ragul.car.payload.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping("")
//    public ResponseEntity<ApiResponse<User>> getUserById(@RequestParam Long id){
//        User user = userService.findUserById(id);
//        return new ResponseEntity<>(new ApiResponse<>(user), HttpStatus.OK);
//
//    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<User>> saveUser(@RequestBody User user){
        try{
            userService.saveUser(user);
            return  new ResponseEntity<>(new ApiResponse<>(user), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(user), HttpStatus.CONFLICT);
        }
    }

//    @PostMapping("/login")
//    public ResponseEntity<ApiResponse<User>> login(@RequestParam String userName, @RequestBody String password){
//        User user = userService.findUserByUserName(userName);
//        if(user.getPassword().equals(password)){
//            return  new ResponseEntity<>(new ApiResponse<>(user), HttpStatus.ACCEPTED);
//        }else{
//            return new ResponseEntity<>(new ApiResponse<>(new User()), HttpStatus.UNAUTHORIZED);
//        }
//
//    }

}
