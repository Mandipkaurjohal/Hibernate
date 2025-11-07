package com.Hibernate.HiberneteDemo.Repository;

import com.Hibernate.HiberneteDemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> //Entity class whaich has all properties to create Table and JpaRepository will create automatically table using entity class. an Lomg is primary key data type in Entity class
{

      // TO FIND LASTNAME OF BY ENTERING FIRST NAME

      // hQL query
    //  @Query("SELECT s.lastName from User s where s.name=:name")


//(SQL query )
       @Query(nativeQuery = true, value = "SELECT last_name FROM users  where name= :name  ")

     // @Query(value = "SELECT last_name FROM users WHERE name = :firstName", nativeQuery = true)

      List<String> findAllLastNameByName(String name);

}




