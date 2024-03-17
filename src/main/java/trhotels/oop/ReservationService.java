package trhotels.oop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;

public class ReservationService implements IReservationManager{
    private List<Reservation> reservations;

    public ReservationService(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public boolean isAvailable(Room room, Date checkInDate, Date checkOutDate) {
        return reservations.stream()
            .filter(reservation -> reservation.getRoom().equals(room))
            .noneMatch(reservation -> reservation.getCheckInDate().compareTo(checkOutDate) < 0 && reservation.getCheckOutDate().compareTo(checkInDate) > 0);
    }
    @Override
    public Reservation createReservation(User user, Hotel hotel, Room room, Date checkInDate, Date checkOutDate, double totalPrice) {
        if (isAvailable(room, checkInDate, checkOutDate)) {
            Reservation newReservation = new Reservation(user, hotel, room, checkInDate, checkOutDate, totalPrice);
            reservations.add(newReservation);
            return newReservation;
        } else {
            throw new RuntimeException("Room is not available for the given date range");
        }
    }

    @Override
    public boolean cancelReservation(Reservation reservation) {
        return reservations.remove(reservation);
    }

    public List<Reservation> getUserReservations(User user) {
        return reservations.stream()
            .filter(reservation -> reservation.getUser().equals(user))
            .collect(Collectors.toList());
    }

}