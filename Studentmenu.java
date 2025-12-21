
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int rollno;
    int mark;

    public Student(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }
    
    public void setname(String name){
        this.name=name;
    }
    public void setrollno(int rollno){
        this.rollno=rollno;
    }
    public void setmark(int mark){
        this.mark=mark;
    }
    public String getname(){
        return name;
    }
    public int getrollno(){
        return rollno;
    }
    public int getmark(){
        return mark;
    }
    public void showdet(){
        System.out.println(getname()+"(Roll no:"+getrollno()+",marks:"+getmark()+")");
    }
}

public class Studentmenu{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Student> std=new ArrayList<>();
        
while (true) { 

System.out.println("Student Menu");

System.out.println("1.Add Student");

System.out.println("2.Show all Students ");

System.out.println("3.Search Student by roll No");

System.out.println("4.Exit");


System.out.println("choose option:");
int choise=sc.nextInt();

switch(choise){

      case 1:
        System.out.println("Enter name:");
        String name=sc.next();

        System.out.println("Enter roll no:");
        int rollno=sc.nextInt();

        System.out.println("Enter mark:");
        int marks=sc.nextInt();

        std.add(new Student(name, rollno, marks));
        System.out.println("Student Added");
        break;

      case 2:
        System.out.println("Student list:");
        for(Student s:std){
            s.showdet();
        }
        break;
     
     case 3:

        System.out.println("Enter roll no:");
        int searchrollno=sc.nextInt();
       for(Student s: std){
         if(s.getrollno() == searchrollno){
            System.out.println("Found:");
            s.showdet();
         }
       } 
      break;

    case 4:
        System.out.println("Good boy");
        return;



}

}

 }

}