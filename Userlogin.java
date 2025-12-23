import java.util.Scanner;
class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message){
         super(message);
    }
}
class InvalidpasswordException extends Exception{
    public InvalidpasswordException(String message){
        super(message);
    }
}
public class Userlogin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
    //User name  
     System.out.println("Enter the Username:");
     String name=sc.nextLine();
   
       if(name.isEmpty()){
         throw new InvalidUsernameException("you Should enter the user name.");
        }
        if(name == name.toUpperCase()){
            throw new InvalidUsernameException("not allowed upprecase");
        }
        if(name.matches("[a-z]*")){
            throw new InvalidUsernameException("capital");
        }
    
    //Password
    System.out.println("Enter the password:");
    String password=sc.nextLine();
    
      if(password.length() > 10 ){
          throw new InvalidpasswordException("Allowed only 10 character");
      }
    if(password.matches("[0-9]*")){
        throw new InvalidpasswordException("special character  not allowed");
    }    

     
       }catch(InvalidUsernameException e){
            System.out.println("Error:"+e.getMessage());
       }catch(InvalidpasswordException e){
            System.out.println("Error:"+e.getMessage());
       }


    }
}