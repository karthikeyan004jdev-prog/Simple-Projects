import java.util.ArrayList;
import java.util.Scanner;
//Base class
abstract class pet{
  String name;
  int age;

     pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

   abstract void speak();

   public void show(){
     System.out.println(name+"("+age+"years old"+")");
     speak();
   }

}
//sub class
class Dog extends pet{

    public Dog(String name,int age) {
      super(name, age);
    }
    @Override
   void speak(){
    System.out.println(name+"woof!");
   }
  
}
class Cat extends pet{
   
   public Cat(String name,int age){
    super(name, age);
   }
   @Override
  void speak(){
     System.out.println(name+"meow");
  }
}


class petmenu{
  public static void main(String[] args) {
  
  
    Scanner input=new Scanner(System.in);
    ArrayList<pet> pets=new ArrayList<>();
  
  
  while (true) { 
    System.out.println("Pet store Menu");

    System.out.println("1.Add Dog");

    System.out.println("2.Add cat");
    
    System.out.println("3.Show all pets");

    System.out.println("4.Exit");


    System.out.println("Choose the option:");
    int choice=input.nextInt();

    

switch(choice){

case 1:

System.out.println("Enter dog name:");
String name=input.next();

System.out.println("Enter dog age:");
int age=input.nextInt();

pets.add(new Dog(name, age));

System.out.println("Dog Added!");
System.out.println("");
break;

case 2:

System.out.println("Enter cat name:");
String cname=input.next();

System.out.println("Enter cat age:");
input.nextInt();
int cage=input.nextInt();

pets.add(new Cat(cname, cage));

System.out.println("Cat Added!");
System.out.println("");
break;

case 3:
for(pet p:pets){
  p.show();
}
break;

case 4:

System.out.println("Good bye!");
  input.close();
  return;

}


  }
      
  }
}