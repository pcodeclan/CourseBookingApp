package pcodeclan.com.github.cousebooking.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pcodeclan.com.github.cousebooking.models.Booking;
import pcodeclan.com.github.cousebooking.models.Course;
import pcodeclan.com.github.cousebooking.repositories.BookingRepository;
import pcodeclan.com.github.cousebooking.repositories.CourseRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Intro To Python", "Glasgow", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("01-05-20", course1);
        bookingRepository.save(booking1);


    }
}
