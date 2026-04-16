import java.util.LinkedList;
import java.util.Queue;

class Reservation {
    String guestName;
    int roomNumber;

    Reservation(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }
}

public class PalindroneChecker2 {

    public static void main(String[] args) {

        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Harsha", 101));
        bookingQueue.add(new Reservation("Ravi", 102));
        bookingQueue.add(new Reservation("Anu", 103));

        System.out.println("Processing Booking Requests (FIFO):");

        while (!bookingQueue.isEmpty()) {
            Reservation r = bookingQueue.poll();
            System.out.println("Booking confirmed for " + r.guestName + " in Room " + r.roomNumber);
        }

        System.out.println("All booking requests processed.");
    }
}