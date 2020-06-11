package pcodeclan.com.github.cousebooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pcodeclan.com.github.cousebooking.models.Course;
import pcodeclan.com.github.cousebooking.repositories.CourseRepository;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    //Get course by ID
    @GetMapping
    public ResponseEntity<Course> getOneCourse(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id).get(), HttpStatus.OK);
    }

    //Get all courses with a given rating
//    @GetMapping
//    public ResponseEntity<List<Course>> getAllCoursesByRating(
//            @RequestParam(name="rating", required = false) Integer rating
//    ){
//        if (rating !=null){
//            return new ResponseEntity<>(courseRepository.findByStarRating(rating), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
//    }

}
