//package com.Hibernate.HiberneteDemo.Controller;
//
//import com.Hibernate.HiberneteDemo.Repository.UserRepository;
//import com.Hibernate.HiberneteDemo.UserEntity.User;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//    private final UserRepository userRepository;
//
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//    @GetMapping
//    public List<User>getAllUsers()
//    {
//        return userRepository.findAll();
//    }
//    @PostMapping
//    public User createUser(@RequestBody User user)
//    {
//        return userRepository.save(user);
//    }
//
//}
