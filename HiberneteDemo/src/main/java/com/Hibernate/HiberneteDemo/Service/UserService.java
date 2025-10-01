package com.Hibernate.HiberneteDemo.Service;

import com.Hibernate.HiberneteDemo.Repository.UserRepository;
import com.Hibernate.HiberneteDemo.UserEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void insertSampleData() {
        User u1 = new User(null, "MANDIP", "kaur", "USER@GMAIL.COM", "1234567");
        User u2 = new User(null, "ALICE", "joe", "ALICE@GMAIL.COM", "9876543");
        userRepository.save(u1);
        userRepository.save(u2);

    }

    // to find list of all Users from database
    public List<User> getUserData() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    //to find users by specific id
    public Optional<User> findUserById(long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    // to create a new data

    public User createNewUser(User user) {
        User save1 = userRepository.save(user);
        return save1;
    }

    public User update(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (optionalUser.isPresent()) {
            return userRepository.save(user);
        }
        return user;
    }

    // TO FIND LASTNAME OF BY ENTERING FIRST NAME

    public List<String> getLastName(String name) {
       return  userRepository.findAllLastNameByName(name);
    }

}
