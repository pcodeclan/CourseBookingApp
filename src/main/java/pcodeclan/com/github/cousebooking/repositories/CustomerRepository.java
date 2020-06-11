package pcodeclan.com.github.cousebooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.cousebooking.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
