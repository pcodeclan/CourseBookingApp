package pcodeclan.com.github.cousebooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pcodeclan.com.github.cousebooking.models.Course;
import pcodeclan.com.github.cousebooking.repositories.CourseRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    //GET /resources/{id}
    @GetMapping(value = "/{id}")
    public ResponseEntity<Course> getOneCourse(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id).get(), HttpStatus.OK);
    }
    //Get all courses with a given rating
    //GET /resources
    //GET /resource?property=value
    @GetMapping(value = "")
    public ResponseEntity<List<Course>> getAllCoursesByRating(
            @RequestParam(name="rating", required = false) Integer rating
    ){
        if (rating !=null){
            return new ResponseEntity<>(courseRepository.findByStarRating(rating), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
    //POST
    @PostMapping
    public ResponseEntity<Course> postCourse(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }
    //PUT
    @PutMapping(value = "{id}")
    public ResponseEntity<Course> putCourse(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping(value = "/{id")
    public ResponseEntity<Long> deleteCourse(@PathVariable Long id){
        courseRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }



}
