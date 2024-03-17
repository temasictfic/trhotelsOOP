package trhotels.oop;

import java.util.List;

public class Amenity {
    private String name;
    private String description;
    private double price;
    private List<String> photos;

    public Amenity(String name, String description, double price, List<String> photos) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.photos = photos;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getPhotos() {
        return photos;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
