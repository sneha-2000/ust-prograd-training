import java.util.PriorityQueue;

public class MuseumTicket {
    public static void main(String[] args)
    {
        PriorityQueue people=new PriorityQueue(10);

        System.out.println(people);
        System.out.println("Tickets that people  taken: ");

        //people.add(1);
        //people.add(2);
        //people.add(3);
        //people.add(4);
        for(int i=1;i<=10;i++)
        {
            people.add(i);
        }
        System.out.println(people);
        //people.forEach(x-> System.out.println(x));

         //people.poll();
        if(people.size()>=10)
        {
            System.out.println("Booking is going on....");
        }
        else {
            System.out.println("All tickets sold out!!!");
        }
         System.out.println(people.poll());
        //System.out.println(people);


    }
}