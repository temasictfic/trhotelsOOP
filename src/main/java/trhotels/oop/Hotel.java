package trhotels.oop;

import java.util.List;

public class Hotel {
    private String name;
    private EHotelType type;
    private Location location;
    private Host host;
    private double rating;
    private String description;
    private List<Amenity> amenities;
    private List<Room> rooms;
    private List<String> photos;

    public Hotel(String name, EHotelType type, Location location, Host host, double rating, String description, List<Amenity> amenities, List<Room> rooms, List<String> photos) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.host = host;
        this.rating = rating;
        this.description = description;
        this.amenities = amenities;
        this.rooms = rooms;
        this.photos = photos;
    }

    // Getters
    public String getName() {
        return name;
    }

    public EHotelType getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public Host getHost() {
        return host;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<String> getPhotos() {
        return photos;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(EHotelType type) {
        this.type = type;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
