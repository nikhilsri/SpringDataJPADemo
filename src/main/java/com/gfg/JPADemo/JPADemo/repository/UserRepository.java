package com.gfg.JPADemo.JPADemo.repository;

import com.gfg.JPADemo.JPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository  extends JpaRepository<User,Long> {


}
