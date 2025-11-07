package com.Hibernate.HiberneteDemo.Controller;

import com.Hibernate.HiberneteDemo.DTO.UserDTO;
import com.Hibernate.HiberneteDemo.Service.UserService;
import com.Hibernate.HiberneteDemo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Component
@RestController
@RequestMapping(value = "/users",produces = MediaType.APPLICATION_JSON_VALUE)

//localhost:8080/users/getAll
public class UserController1 {
    @Autowired
    UserService userService;

    public UserController1(UserService userService) {
        this.userService = userService;
    }

    //private final UserRepository userRepository;

//    public UserController1(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    // to get something from
    @GetMapping("/getAll")
    public List<User> getUserData() {
        List<User> userData = userService.getUserData();

        return userData;
    }

    //localhost:8080/users/byId


    @GetMapping("/byId")
    public Optional<User> findUserById(@RequestParam("id") Long id)// @RequestParam is used when we need a input to find someting. ex to find by id we need id enter by user or frontend . But to find all we gonna click search or what ever option in front end then gonna return all records from database.
    {
        Optional<User> userById = userService.findUserById(id);
        return userById;
    }

//    // to create new data
//    @PostMapping("/create")
//    public User createNewUser(@RequestBody User user)
//    {
//       return userService.createNewUser(user);
////        User newUser = userService.createNewUser(user);
//        return newUser;

    //User save = userRepository.save(user);
    //return save;
//}


// create data using ResponseEntity

@PostMapping("/create" )
    public ResponseEntity<User> createNewUser(@RequestBody User user)
    {
        User newUser = userService.createNewUser(user);
        ResponseEntity<User> userResponseEntity = ResponseEntity.status(HttpStatusCode.valueOf(201))
                .header("Action", "Created")
                .header("GenId", String.valueOf(user.getId()))
                .header("status",String.valueOf(1100))
                .contentType(MediaType.APPLICATION_JSON)
                .body(user);
        return userResponseEntity;

    }

    // TO FIND LASTNAME OF BY ENTERING FIRST NAME

    @PostMapping("/find")
    public List<String> getLastName(@RequestBody UserDTO userDTO)
    {
return  userService.getLastName(userDTO.getName());
    }



}