package Firstpackage;
import java.util.*;
public class if_else {
     static int ticket=151;
     static int remaining;
  public void booking(int no)
  {
    if(ticket>no)
    {
    remaining=ticket-no;
    System.out.println("Ticket Numbers are ");
    for(int i=ticket-1;i>=remaining;i--)
    {
      System.out.print((151-i)+",");  
    }
    ticket=remaining;
    System.out.println("\nThank You Sir/Madam..");
    }
    else
    {
      System.out.println("Sorry sir/madam.. There is only "+(remaining-1)+" tickets left");
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    if_else tt=new if_else();
    while(ticket>1)
    {
      System.out.println("Enter the number of tickets you needed");
      int a=sc.nextInt();
      tt.booking(a);
    }
    if(ticket==1)
    {
      System.out.println("Tickets Sold out..");
    }
  }





}
