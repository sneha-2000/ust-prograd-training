package com.example.movieTicketBookingApplication.repository;

import com.example.movieTicketBookingApplication.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingsRepository extends JpaRepository<Bookings,Long> {
    @Query("Select bookings from Bookings bookings where bookings.userName=:userName")
    List<Bookings> findBookingsByUserId(String userName);
}
