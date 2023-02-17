package dev.nasyxnadeem.hotelservice.services;

import java.util.*;
import dev.nasyxnadeem.hotelservice.models.*;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getHotels();

    Hotel getHotel(String id);
}
