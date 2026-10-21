class MovieTicket {
    String movieName;
    int numberOfTickets;
    double ticketPrice;

    MovieTicket(String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    void calculateBill() {
        double tickets = numberOfTickets;    // int converted to double
        double totalBill = tickets * ticketPrice;

        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Ticket Price: Rs. " + ticketPrice);
        System.out.println("Total Bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Starlight Run", 5, 275.0);
        ticket.calculateBill();
    }
}
