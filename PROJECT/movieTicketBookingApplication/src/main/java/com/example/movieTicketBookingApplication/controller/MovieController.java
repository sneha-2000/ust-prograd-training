package com.example.movieTicketBookingApplication.controller;

import com.example.movieTicketBookingApplication.entity.*;
import com.example.movieTicketBookingApplication.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class MovieController {
    static Long showId;
    static Long moviesId;
//    static Long idSeat;
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieShowService movieShowService;

    @Autowired
    private BookedSeatsService bookedSeatsService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookingsService bookingsService;


    @RequestMapping("/movieDetails")
    public String movie() {
        return "movieDetails";
    }

    @RequestMapping("/movieSlot/{movieId}")
    public String movieShow(@PathVariable Long movieId, Model model){
        Movie movie = movieService.getMovieById(movieId);
        model.addAttribute("slots",movieShowService.getShowByMovieId(movie));
        moviesId = movie.getMovieId();
       // model.addAttribute("movieName",movie.getMovieName());
        return "movieSlot";
    }

    @RequestMapping("/seats/{id}")
    public String seats(@PathVariable Long id,Model model){
        showId = id;
        return "seats";
    }


    @RequestMapping("/payment")
    public String payment(HttpServletRequest request,Model model) {
        String bookSeats = request.getParameter("bookedSeats");
        String[] seats = bookSeats.split(",");
        for (String seat : seats) {
            Long seatId=Long.parseLong(seat);
            BookedSeats bookedSeats=bookedSeatsService.getBookedSeatsByShowIdAndSeatId(showId, seatId);
//            idSeat = bookedSeats.getSeatId();
            if (!(Objects.isNull(bookedSeats)))  {
                model.addAttribute("message", "Seat is already booked, Please choose another seat!!");
                return "seats";
            }
        }
        for (String seat : seats) {
            Long seatId=Long.parseLong(seat);
//            BookedSeats bookedSeats=bookedSeatsService.getBookedSeatsByShowIdAndSeatId(showId, seatId);
            BookedSeats bookedSeats=new BookedSeats(UserController.userId,seatId,showId);
            bookedSeatsService.saveBookedSeats(bookedSeats);
        }
        User user = userService.findUserById(UserController.userId);
        Movie movie = movieService.getMovieById(moviesId);
        MovieShow movieShow = movieShowService.getShowById(showId);

        model.addAttribute("name",user.getName());
        model.addAttribute("movieName",movie.getMovieName());
        model.addAttribute("seats", seats.length);
        model.addAttribute("seatId",bookSeats);
        model.addAttribute("showTime",movieShow.getShowTime());
        model.addAttribute("releaseDate",movieShow.getReleaseDate());
        Double amount = (seats.length)*(movie.getPrice());
        model.addAttribute("amount",amount);
        Bookings bookings = new Bookings(user.getName(),movieShow.getShowTime(),movieShow.getReleaseDate(),seats.length,bookSeats,amount,movie.getMovieName());
        bookingsService.saveBookings(bookings);
        return "payment";
    }

//    @RequestMapping("/myBookings")
//    public String bookings(Model model){
//        User user = userService.findUserById(UserController.userId);
//        Movie movie = movieService.getMovieById(moviesId);
////        MovieShow movieShow = movieShowService.getShowById(showId);
//
//        List<BookedSeats> bookings = bookedSeatsService.getBookedSeatsBYUserId(UserController.userId);
//        model.addAttribute("bookings",bookings);
//        model.addAttribute("userName",user.getName());
////        model.addAttribute("movieName",movie.getMovieName());
////        model.addAttribute("showTime",movieShow.getShowTime());
////        model.addAttribute("releaseDate",movieShow.getReleaseDate());
//        return "myBookings";
//    }

    @RequestMapping("/myBookings")
    public String myBookings(Model model) {
        User user = userService.findUserById(UserController.userId);
        List<Bookings> bookings = bookingsService.getBookingsByUserName(user.getName());
        model.addAttribute("bookings", bookings);
        return "myBookings";
    }

}

