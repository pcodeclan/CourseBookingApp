package pcodeclan.com.github.cousebooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pcodeclan.com.github.cousebooking.models.Booking;
import pcodeclan.com.github.cousebooking.models.Course;
import pcodeclan.com.github.cousebooking.repositories.BookingRepository;
import pcodeclan.com.github.cousebooking.repositories.CourseRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    //GET /resources/{id}
    @GetMapping(value = "/{id}")
    public ResponseEntity<Booking> getOneBooking(@PathVariable Long id){
        return new ResponseEntity<>(bookingRepository.findById(id).get(), HttpStatus.OK);
    }
    //Get all courses with a given rating
    //GET /resources
    //GET /resource?property=value
//    @GetMapping(value = "")
//    public ResponseEntity<List<Booking>> getAllBookingsByDate(
//            @RequestParam(name="date", required = false) String date
//    ){
//        if (date !=null){
//            return new ResponseEntity<>(bookingRepository.findByStarRating(rating), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
//    }
    //POST
    @PostMapping
    public ResponseEntity<Booking> postBooking(@RequestBody Booking booking){
        bookingRepository.save(booking);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }
    //PUT
    @PutMapping(value = "{id}")
    public ResponseEntity<Booking> putBooking(@RequestBody Booking booking){
        bookingRepository.save(booking);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping(value = "/{id")
    public ResponseEntity<Long> deleteBooking(@PathVariable Long id){
        bookingRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
