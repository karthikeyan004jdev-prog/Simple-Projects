import java.util.Scanner;

class nameException extends Exception{
    public nameException(String message){
        super(message);
    }
}

class Invalidinsufficient extends Exception{

    public Invalidinsufficient(String message) {
        super(message);
    }
}
class PasswordException extends Exception{
    public PasswordException(String message){
        super(message);
    }
}
public class AtmSystem{
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int balance=5000;
int pin=1234;
String name="Karthik";

try {
   
System.out.println("Enter the name:");
    String na=sc.next();
    if(!na.equals(name)){
        throw new nameException("incorrect");
    }

 System.out.println("Enter the pinNo:");
    int pinNo=sc.nextInt();
       if(pinNo != pin){
        throw new PasswordException("Incorrect password!");
       }else{
        System.out.println("Correct!");
       }

    System.out.println("Enter the withdrawal amount:");
    int wid=sc.nextInt();

    if(balance<wid){
        throw new Invalidinsufficient("insufficient balance.");
    }else {
       System.out.println("withdrawal successfully!");
    } 
    balance-=wid;
    System.out.println("Balance Amount:"+balance);
    
    
}catch(nameException e){
    System.out.println("Error:"+e.getMessage());
}catch(PasswordException e){
    System.out.println("Error:"+e.getMessage());
} catch (Invalidinsufficient e) {
    System.out.println("Error:"+e.getMessage());
}finally{
    System.out.println("Thank you!");
}


    }
}