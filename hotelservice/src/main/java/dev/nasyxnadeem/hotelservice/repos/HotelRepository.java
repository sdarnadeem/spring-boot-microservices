package dev.nasyxnadeem.hotelservice.repos;

import org.springframework.data.jpa.repository.*;
import dev.nasyxnadeem.hotelservice.models.*;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
