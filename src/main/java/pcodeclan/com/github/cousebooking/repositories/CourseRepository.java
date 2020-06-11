package pcodeclan.com.github.cousebooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.cousebooking.models.Course;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
//Get all courses with a given rating
    List<Course> findByStarRating(int starRating);
//Get all courses for a given customer

}
