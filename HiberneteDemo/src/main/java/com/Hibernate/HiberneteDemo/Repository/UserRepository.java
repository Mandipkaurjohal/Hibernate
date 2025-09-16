package com.Hibernate.HiberneteDemo.Repository;

import com.Hibernate.HiberneteDemo.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> //Entity class whaich has all properties to create Table and JpaRepository will create automatically table using entity class. an Lomg is primary key data type in Entity class
{
      List<User> findAllUserByFirstName(String name);
}
