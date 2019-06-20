package com.gfg.JPADemo.JPADemo.commandlinerunner;

import com.gfg.JPADemo.JPADemo.model.User;
import com.gfg.JPADemo.JPADemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Component
public class UserCrudComandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Is UserCommandLineRunner is working");
        User user1=new User("Nikhil","Srivastava");
        userRepository.save(user1);

        User user2=new User("Uncle","Bob");
        userRepository.save(user2);

        List<User> users=userRepository.findAll();

        System.out.println("Before deletion "+users.toString());

        userRepository.delete(user1);

        users=userRepository.findAll();

        System.out.println("After deletion "+users.toString());

        user2.setFirstName("Jhonson");

        userRepository.save(user2);

        users=userRepository.findAll();

        System.out.println("After Updation "+users.toString());

        userRepository.save(new User("Smith","Rod"));
        userRepository.save(new User("Uncle","Sam"));

        users=userRepository.findByFirstName("Smith");

        System.out.println("User with firstName Smith is "+users);

        users=userRepository.findByFirstNameAndLastName("Uncle","Sam");

        System.out.println("Finding by and "+users);

    }
}
