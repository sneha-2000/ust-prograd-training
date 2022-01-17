package com.example.movieTicketBookingApplication.service;

import com.example.movieTicketBookingApplication.entity.BookedSeats;
import com.example.movieTicketBookingApplication.repository.BookedSeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatsService {

    @Autowired
    private BookedSeatsRepository bookedSeatsRepository;

    public void saveBookedSeats(BookedSeats bookedSeats){
        bookedSeatsRepository.save(bookedSeats);
    }
    public BookedSeats getBookedSeatsByShowIdAndSeatId(Long showId,Long seatId){
        return bookedSeatsRepository.findBookedSeatsByShowIdAndSeatId(showId,seatId);
    }
    public BookedSeats getSeatById(Long seatId){
        return bookedSeatsRepository.getById(seatId);
    }

//    public List<BookedSeats> findByCustomerUserName(String userName){
//        return bookedSeatsRepository.findByCustomerUserName(userName);
//    }


    public List<BookedSeats> getBookedSeatsByUserId(Long customerId){
        return bookedSeatsRepository.findBookedSeatsByUserId(customerId);
    }
}
