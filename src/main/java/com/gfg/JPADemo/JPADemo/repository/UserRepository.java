package com.gfg.JPADemo.JPADemo.repository;

import com.gfg.JPADemo.JPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository  extends JpaRepository<User,Long> {

    List<User> findByFirstName(String firstName);
    List<User> findByFirstNameAndLastName(String firstName,String lastName);
}
