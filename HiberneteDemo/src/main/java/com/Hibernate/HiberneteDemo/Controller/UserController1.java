package com.Hibernate.HiberneteDemo.Controller;

import com.Hibernate.HiberneteDemo.Repository.UserRepository;
import com.Hibernate.HiberneteDemo.Service.UserService;
import com.Hibernate.HiberneteDemo.UserEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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


@PostMapping("/create" )
    public User createNewUser(@RequestBody User user)
    {
      return userService.createNewUser(user);

    }

}