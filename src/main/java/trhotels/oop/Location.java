package trhotels.oop;

public class Location {
    private String city;
    private String state;
    private String country;
    private String address;

    public Location(String city, String state, String country, String address) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.address = address;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getaddress() {
        return address;
    }

    // Setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setaddress(String address) {
        this.address = address;
    }
}
