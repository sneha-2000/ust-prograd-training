package com.example.movieTicketBookingApplication.service;

import com.example.movieTicketBookingApplication.entity.User;
import com.example.movieTicketBookingApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User findUserById(Long id){
        return userRepository.getById(id);
    }

}
