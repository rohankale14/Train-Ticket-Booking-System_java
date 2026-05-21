import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {

    private final Scanner scanner = new Scanner(System.in);

    private final UserService userService = new UserService();

    private final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        new IRCTCAPP().start();

    }

    public void start(){

        while (true){
            System.out.println("\n-------Welome to IRCTC App-------");
            if (!userService.isLoggedIn()){
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("3.Exit");
                System.out.print("Enter Choice:");
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1: register();
                    break;
                    case 2: login();
                    break;
                    case 3: exitApp();
                    break;
                    default:
                        System.out.println("Invalid Choice.");

            }
        }
            else {
                showUserMenu();
            }

    }
}
public void register(){
    System.out.print("Enter username: ");
    String username = scanner.next();
    System.out.print("Enter password: ");
    String password = scanner.next();
    System.out.print("Enter Full Name: ");
    scanner.nextLine();
    String fullName = scanner.nextLine();
    System.out.println("Enter Email id: ");
     String emailid = scanner.nextLine();
    System.out.print("Enter contact: ");
    String contact = scanner.next();

    userService.registerUser(username,password,fullName,emailid,contact);
    if (!userService.isLoggedIn()){
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.print("Enter Choice:");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1: register();
                break;
            case 2: login();
                break;
            case 3: exitApp();
                break;
            default:
                System.out.println("Invalid Choice.");
                break;

        }
    }

    }
    public void login(){
        System.out.println("Enter for login ");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

         userService.loginUser(username,password);
    }

    private void showUserMenu(){
        while (userService.isLoggedIn()){
            System.out.println("\n-----User Menu------");
            System.out.println("1.Search Trains");
            System.out.println("2.Book Ticket");
            System.out.println("3.View My Tickets");
            System.out.println("4.Cancel Tickets");
            System.out.println("5.View All Trains");
            System.out.println("6. Logout User");
            System.out.println("Enter Choice:");
            int choicee = scanner.nextInt();
            switch (choicee){
                case 1 : searchTrain();
                    break;
                case 2 : bookTicket();
                    break;
                case 3 : viewTicket();
                    break;
                case 4 : cancelTicket();
                    break;
                case 5 : bookingService.listAllTrain();
                    break;
                case 6 : userService.logOutUser();
                    break;
                default:
                    System.out.println("Invalid Choice .");
                    break;
            }
        }
    }

    private void searchTrain(){
        System.out.print("Enter source station");
        String source = scanner.next();
        System.out.print("Enter destination station");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("No Trains Found between "+source + "and"+destination);
            return;
        }
        System.out.print("Trains Found");
        for (Train train:trains)
        {
            System.out.println(train);
        }
        System.out.println("Do you want to book ticket ? (yes/no):");
         String choice = scanner.next();
         if(choice.equalsIgnoreCase("yes")){
             System.out.println("Enter Train ID to book:");
             int trainID=scanner.nextInt();
             System.out.println("Enter number of seats to book");
             int seats = scanner.nextInt();

             Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
             if (ticket!= null){
                 System.out.println("Booking successful");
                 System.out.println(ticket);
             }

         }
         else {
             System.out.println("Returning to user menu....");
         }
    }

    private void bookTicket(){
        System.out.print("Enter source station");
        String source = scanner.next();
        System.out.print("Enter destination station");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("No Trains available for booking.");
            return;
        }
        System.out.println("Available Trains");
        for (Train train:trains)
        {
            System.out.println(train);
        }
        System.out.print("Enter Train ID to book:");
        int trainID=scanner.nextInt();
        System.out.print("Enter number of seats to book");
        int seats = scanner.nextInt();

        Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
        if (ticket!= null){
            System.out.println("Booking successful");
            System.out.println(ticket);
        }

    }

    private void viewTicket(){
        List<Ticket> ticketByuser = bookingService.getTicketByuser(userService.getCurrentUser());
       if (ticketByuser.isEmpty()){
           System.out.println("No Ticket Booked yet");
       }
       else {
           System.out.println("Your Tickets:");
           for (Ticket ticket:ticketByuser){
               System.out.println(ticket);
           }
       }
    }

    private void cancelTicket(){
        System.out.print("Enter Train ID to cancel:");
        int ticketID=scanner.nextInt();
        bookingService.cancelTicket(ticketID,userService.getCurrentUser());

    }

    private void exitApp(){
        System.out.println("Thank for using IRCTC App");

    }
}
