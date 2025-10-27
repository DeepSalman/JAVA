package FINAL.Thread;

class MovieTheater {
    int availableSeats;

    MovieTheater(int s) {
        availableSeats = s;
    }

    public synchronized int bookTickets(int numOFseats) {
        int numOfTicketsBooked = 0;
        // The tickets are booked one by one
        for (int i = 1; i <= numOFseats; i++) {
            if (availableSeats > 0) {
                availableSeats--;
                numOfTicketsBooked++;
            }
        }
        return numOfTicketsBooked;
    }
}

class User extends Thread {
    MovieTheater m;
    int numOfTickets;
    int bookedTickets;

    User(MovieTheater m, int numOfTickets, String name) {
        super(name); // set thread name
        this.m = m;
        this.numOfTickets = numOfTickets;
    }

    public void run() {
        bookedTickets = m.bookTickets(numOfTickets);
        System.out.println(getName() + " has booked " + bookedTickets + " tickets");
    }
}
class Movie {
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(15);

        User u1 = new User(theater, 6, "Mina");
        User u2 = new User(theater, 8, "Nabil");
        User u3 = new User(theater, 4, "Farhan");

        u1.start();
        u2.start();
        u3.start();

        try {
            u1.join();
            u2.join();
            u3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Available tickets: " + theater.availableSeats);
    }
}


