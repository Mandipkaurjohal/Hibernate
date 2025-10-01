package com.Hibernate.HiberneteDemo.Runner;

import com.Hibernate.HiberneteDemo.Repository.UserRepository;
import com.Hibernate.HiberneteDemo.Service.UserService;
import com.Hibernate.HiberneteDemo.UserEntity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
@Data

// to add initial data into data base
public class DataLoader implements CommandLineRunner {
   @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user= new User(null,"Taj","joh","taj@gmail.com","1234567");
          userRepository.save(user);


    }

}

