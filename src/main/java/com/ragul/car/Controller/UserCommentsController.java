package com.ragul.car.Controller;


import com.ragul.car.Model.UserComments;
import com.ragul.car.Service.UserCommentsService;
import com.ragul.car.payload.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/userComments")

public class UserCommentsController {
    @Autowired
    UserCommentsService userCommentsService;

//    @GetMapping("")
//    public ResponseEntity<ApiResponse<UserComments>> getUserById(@RequestParam Long id){
//        UserComments userComments = userCommentsService.findUserCommentsById(id);
//        return new ResponseEntity<>(new ApiResponse<>(userComments), HttpStatus.OK);
//
//    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<UserComments>> saveUserComments(@RequestBody UserComments userComments){
        try{
            userCommentsService.saveUserComments(userComments);
            return  new ResponseEntity<>(new ApiResponse<>(userComments), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(userComments), HttpStatus.CONFLICT);
        }
    }

    @PostMapping(value ="/deleteUserComments{id}", consumes = {"application/json"})
    public ResponseEntity<ApiResponse<Integer>> deleteUserComments(@RequestParam Integer id){
        userCommentsService.deleteUserCommentsById(id);
        return  new ResponseEntity<>(new ApiResponse<>(id), HttpStatus.OK);
    }

//    @GetMapping("/getAllUserComments")
//    public ResponseEntity<ApiResponse<List<UserComments>>> findAll() {
//        return new ResponseEntity<>(new ApiResponse<>(userCommentsService.findAll()), HttpStatus.OK);
//    }

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
