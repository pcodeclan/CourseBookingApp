package pcodeclan.com.github.cousebooking;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pcodeclan.com.github.cousebooking.models.Booking;
import pcodeclan.com.github.cousebooking.models.Course;
import pcodeclan.com.github.cousebooking.repositories.BookingRepository;
import pcodeclan.com.github.cousebooking.repositories.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CousebookingApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	void canAddCourseAndBookingsThenSave() {
		Course course1 = new Course("Intro To Python", "Glasgow", 5);
		courseRepository.save(course1);

		Booking booking1 = new Booking("01-05-20", course1);
		bookingRepository.save(booking1);
	}
}
