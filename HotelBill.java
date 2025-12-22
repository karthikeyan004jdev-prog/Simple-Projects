import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidquantityException extends Exception{
    public InvalidquantityException(String message) {
        super(message);
    }  
}
public class HotelBill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//creates the input reader
           
        String[] items={"1.Idli","2.Dosa","3.Tea","4.Coffee"};
        int[] prices={30,50,10,15};
        int[] Stock={10,20,30,40};
       
        int total=0;//accumulate the bill
       

        System.out.println("welcome to hotel billing system");
        System.out.println("Menu:");

        for(int i=0; i<items.length; i++){   //loop prints each item with its price
            System.out.println(items[i]+"-Rs."+prices[i]);
        }     

        try {
            while (true) { 
                System.out.println("Enter item number(1-4)or 0 to finish:");
                int choice=sc.nextInt();

                if(choice==0) break;//user enter 0 to stop ordering

                if(choice<1 || choice>4){ //if the number is not 1-4,print invalid choice and continue(loop restart) 
                    System.out.println("Invalid choice! please select from 1 to 4.");
                    continue;
                }

                System.out.println("Enter the quantity:");
                int qty=sc.nextInt();

                if(qty>=10){ //this is throw the custom checked exception
                    throw new InvalidquantityException("quantity must be less than 10!");
                }
                int cost=prices[choice-1]*qty;
                total += cost;
                System.out.println("Added"+qty+"x"+items[choice-1]+"=Rs."+cost);
            }
                System.out.println("Total Bill amount=Rs."+total);
        } catch (InputMismatchException e) {
               System.out.println("Error:please enter number only");
        }catch(InvalidquantityException e){
            System.out.println("Error:"+e.getMessage());

        }


    }
}