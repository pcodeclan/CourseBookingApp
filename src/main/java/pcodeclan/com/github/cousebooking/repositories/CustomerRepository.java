package pcodeclan.com.github.cousebooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.cousebooking.models.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//Get all customers for a given course
//    List<Customer> findByCourseName(String name);
}
