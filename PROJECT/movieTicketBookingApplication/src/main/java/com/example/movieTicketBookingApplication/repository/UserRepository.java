package com.example.movieTicketBookingApplication.repository;

import com.example.movieTicketBookingApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

}
