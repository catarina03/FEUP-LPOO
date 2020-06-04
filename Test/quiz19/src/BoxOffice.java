import java.util.ArrayList;

public class BoxOffice {
    public BoxOffice() {
    }

    public static ArrayList<Ticket> buy(Concert concert, int number) throws InvalidTicket {
        ArrayList<Ticket> tickets = new ArrayList<>();

        for (int i = 0; i < number; i++){
            tickets.add(new Ticket(concert.getTicketsSold() + 1, concert));
            concert.setTicketsSold(concert.getTicketsSold() + 1);
        }

        return tickets;
    }
}
