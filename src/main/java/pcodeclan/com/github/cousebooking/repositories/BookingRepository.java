package pcodeclan.com.github.cousebooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.cousebooking.models.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
//Get all bookings for a given date
}
