package trhotels.oop;

import java.util.Date;

public interface IReservationManager {

    public Reservation createReservation(User user, Hotel hotel, Room room, Date checkInDate, Date checkOutDate, double totalPrice);
    public boolean cancelReservation(Reservation reservation);

}
