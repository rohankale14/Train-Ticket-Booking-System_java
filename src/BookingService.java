import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {

    private List<Train> trainList = new ArrayList<>();

    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService(){
       trainList.add(new Train("12/07/2025",101,"Shathabdi Expres","Malkapur","Mumbai Central",100));
        trainList.add(new Train("12/07/2025",102,"Rajdhani Expres","Malkapur","Banglore",100));
       trainList.add(new Train("12/07/2025",102,"Rajdhani Expres","Malkapur","Banglore",100));
       trainList.add(new Train("12/07/2025",103,"Vande Bharat","Malkapur","Nashik",100));
       trainList.add(new Train("12/07/2025",104,"Tejas Expres","Malkapur","Pune",100));
       trainList.add(new Train("12/07/2025",105,"Humsafar Expres","Malkapur","Chatrapati Sambhaji Nagar",100));


    }
    public List<Train> searchTrain(String source,String destination){
        List<Train> res=new ArrayList<>();
        for (Train train:trainList){
            if(train.getSource().equalsIgnoreCase(source)&& train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }
        return res;
    }

     Ticket bookTicket(User user,int trainId,int SeatCount){

        for (Train train:trainList){
            if (train.getTrainId()==trainId){
                if (train.bookseats(SeatCount)){
                    Ticket ticket = new Ticket(user,train, SeatCount);
                    ticketList.add(ticket);
                    return ticket;

                }
                else {
                    System.out.println("No enough seat available");
                    return null;
                }
            }
        }
        System.out.println("Train ID not found");
        return null;
    }

    public List<Ticket> getTicketByuser(User user){
        List<Ticket> res = new ArrayList<>();
        for(Ticket ticket:ticketList){
            if (ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }
        return res;
    }
    public boolean cancelTicket(int ticketId,User user){
        Iterator<Ticket> iterator = ticketList.listIterator();
        while (iterator.hasNext()){
            Ticket ticket = iterator.next();
            if (ticket.getTicketId()==ticketId &&
            ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){

                Train train = ticket.getTrain();
                train.cancelseats(ticket.getSeatBooked());
                iterator.remove();
                System.out.println("Ticket "+ticketId +"cancelled Successfully");
                return true;
            }
        }
        System.out.println("Ticket not found or does not belong to current user");
        return false;
    }
    public void listAllTrain(){
        System.out.println("List of all trains");
        for (Train train:trainList){
            System.out.println(train);
        }
    }

}
