import java.util.Scanner;
//Custom exception for insufficient
class InsufficientBalance extends Exception{

    public InsufficientBalance(String message) {
        super(message);
    } 
}
//Custom exception for invalid amount
class InvalidAmount extends Exception{
    public InvalidAmount(String message){
        super(message);
    }
}
public class ATMwithdrawal{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int bal=5000;//initial balance
       
        try {
         
              
        System.out.println("Enter amount to Withdrawal:");
        int amount=sc.nextInt();
            //check for insufficient balance
            if(amount>bal){
                throw new InsufficientBalance("Insufficient Balance!");
            }
            //check for invalid amount
            if(amount<=0){
                throw new InvalidAmount("Invalid Amount!");
            }
            //deduct balance
            bal-=amount;
            System.out.println("Withdrawal Successful! Amount deducted Rs."+amount);
            System.out.println("Remainig balance:"+bal);
          
    

        } catch(InsufficientBalance e){
            System.out.println("Error:"+e.getMessage());
        }catch(InvalidAmount e){
            System.out.println("Error:"+e.getMessage());
        }catch(Exception e){
            System.out.println("Unex Error:"+e.getMessage());
        }
        finally{
            System.out.println("Thankyou for using ATM.");
        }

        }
    }
