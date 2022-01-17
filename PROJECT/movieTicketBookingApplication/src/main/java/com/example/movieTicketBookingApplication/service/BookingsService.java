package com.example.movieTicketBookingApplication.service;

import com.example.movieTicketBookingApplication.entity.Bookings;
import com.example.movieTicketBookingApplication.repository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingsService {
    @Autowired
    private BookingsRepository bookingsRepository;

    public void saveBookings(Bookings bookings) {
        bookingsRepository.save(bookings);
    }

    public List<Bookings> getBookingsByUserName(String userName) {
        return bookingsRepository.findBookingsByUserId(userName);
    }
}
