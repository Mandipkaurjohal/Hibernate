package com.Hibernate.HiberneteDemo.Repository;

import com.Hibernate.HiberneteDemo.Entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepo extends JpaRepository<Phone,Integer> {
}
