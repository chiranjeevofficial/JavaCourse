// In Delhi, there is a special train with peculiar fave system. Ticket price is @10 for male with age above 50,
// @20 for rest of the male passengers. Ticket price is @50 for female with age below 30 years and for rest of
// the females ticket price is @40.
// Write a Java Program to display ticket price for a passengers.
//
//   male>50 age - @10
//   male<50 age - @20
// female>30 age - @40
// female<30 age - @50

public class Assignment02_TicketSystem {
    public static void main(String []args){
//        int MaleAge=28, FemaleAge=22;
//        if(MaleAge>50)
//            System.out.println("Ticket Price for Male > 50 Age is: 10 Rupees");
//        else
//            System.out.println("Ticket Price for Male < 50 Age is: 20 Rupees");
//        if(FemaleAge>30)
//            System.out.println("Ticket Price for Female > 30 Age is: 40 Rupees");
//        else
//            System.out.println("Ticket Price for Female < 30 Age is: 50 Rupees");
        int Age=40;
        char Gender='F';
        if(Gender=='M')
            if(Age>50)
                System.out.println("Ticket Price is: 10 Rupees");
            else
                System.out.println("Ticket Price is: 20 Rupees");
        else
            if(Age>30)
                System.out.println("Ticket Price is: 40 Rupees");
            else
                System.out.println("Ticket Price is: 50 Rupees");
    }
}
