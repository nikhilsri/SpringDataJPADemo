package com.gfg.JPADemo.JPADemo.commandlinerunner;

import com.gfg.JPADemo.JPADemo.model.User;
import com.gfg.JPADemo.JPADemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;

@Component
public class UserCrudComandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Is UserCommandLineRunner is working");
        User user1=new User("Nikhil","Srivastava");
        userRepository.save(user1);


    }
}
