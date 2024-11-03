package com.eCommerceWebsite.eCommerceWebsite.service;
import com.eCommerceWebsite.eCommerceWebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public String getUserByNameStartsWithB(Long id) {
        return userRepository.findUserStartsWithB(id);
    }

    public void createUser(String name) { // Simulating user creation logic
        System.out.println("Creating user: " + name);
    }

}

//hit controller--> hit button--. backend endpoint is controller, send endpoint and data to the endpoint
//spring controller--> trigger the method
//service class--> from controller to service layer(business layer) , fetch data from repository
//repository--> fetch data or do business logic from db or external endpoint
//send back data to service class
//service data will be returned to the controller
//controller to UI

//service layer--> get data from repository, id=3, check if user name starts with B, make it as Upper case and return
//if it doesn't start with B, return user not found
//method-->getcustomusers.(implement using streams)