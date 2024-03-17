package trhotels.oop;

import java.util.List;
import java.util.stream.Collectors;

public class Search {
    private List<Hotel> hotels;

    public Search(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> searchByLocation(String city) {
        return hotels.stream()
            .filter(hotel -> hotel.getLocation().getCity().equalsIgnoreCase(city))
            .collect(Collectors.toList());
    }

    public List<Hotel> searchByPriceRange(double minPrice, double maxPrice) {
        return hotels.stream()
            .filter(hotel -> hotel.getRooms().stream().anyMatch(room -> room.getPrice() >= minPrice && room.getPrice() <= maxPrice))
            .collect(Collectors.toList());
    }
}
