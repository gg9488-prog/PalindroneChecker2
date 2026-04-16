# PalindroneChecker2

 BookMyStay App
 Use Case 6 (UC6): Booking Allocation from Queue (FIFO Processing)

 Objective
The objective of UC6 is to process booking requests in a fair manner using a queue, ensuring that requests are handled in the order they were received (First-Come-First-Served).

 Running Procedure
1. Save the file as `PalindroneChecker2.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:

5. Run the program:
Flow of Project

Start
  ↓
Initialize Booking Queue
  ↓
Add Booking Requests to Queue
  ↓
Process Requests using FIFO
  ↓
Remove Request using poll()
  ↓
Confirm Booking
  ↓
Repeat until Queue is Empty
  ↓
End

Topics Covered

* Java Program Structure
* Queue Interface
* LinkedList Implementation
* FIFO Principle
* Object-Oriented Programming (Class & Object)
* Looping (`while`)
* Data Structure Application


 Use Case

* Ensures fair booking allocation
* Processes requests in arrival order
* Simulates real-world booking systems
* Helps understand queue-based processing



UC6 Code

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

Sample Output
Processing Booking Requests (FIFO):
Booking confirmed for Harsha in Room 101
Booking confirmed for Ravi in Room 102
Booking confirmed for Anu in Room 103
All booking requests processed.


Conclusion
UC6 demonstrates how a queue can be used to process booking requests fairly and efficiently, ensuring that all users are served in the order of arrival.

 