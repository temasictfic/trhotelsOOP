package trhotels.oop;

import java.util.List;

public class Room {
    private String roomType;
    private double price;
    private int capacity;
    private List<Amenity> amenities;
    private List<String> photos;

    public Room(String roomType, double price, int capacity, List<Amenity> amenities, List<String> photos) {
        this.roomType = roomType;
        this.price = price;
        this.capacity = capacity;
        this.amenities = amenities;
        this.photos = photos;
    }

    // Getters
    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public List<String> getPhotos() {
        return photos;
    }

    // Setters
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}