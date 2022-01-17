package com.example.movieTicketBookingApplication.repository;

import com.example.movieTicketBookingApplication.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats, Long> {

    @Query("Select seats from BookedSeats seats where seats.showId=:showId and seats.seatId=:seatId")
    BookedSeats findBookedSeatsByShowIdAndSeatId(Long showId,Long seatId);

    @Query("Select seats from BookedSeats seats where seats.userId=:userId")
    List<BookedSeats> findBookedSeatsByUserId(Long userId);

//    public List<BookedSeats> findByCustomerUserName(String username);
}
