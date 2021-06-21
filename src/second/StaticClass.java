package second;
import java.util.Scanner;

import java.util.Scanner;

class student{
    String name;
    int roll;
    static String college="Tezpur University";

    student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }



    public void display(){
        System.out.println("Name: "+name+" Roll: "+roll+" College: "+college);
    }

    static void  change(){
        college="Guwahati University";
    }
}

class BooleanBooleanValue{
    public void check(){
        Scanner sc= new Scanner(System.in);
        System.out.print("1 number:"); int a= sc.nextInt();
        System.out.print("2 number:"); int b= sc.nextInt();
        Boolean result= (a>b)?true:false;

        if(result.booleanValue()){
            System.out.println("The first number: "+a+" is greater");
        }
        else{
            System.out.println("The second number: "+b+" is greater");
        }
    }
}

public class StaticClass{
    public static void main(String[] args){
        student.change();
        student s1= new student("Mandeep",10);
        student s2= new student("Sandeep",20);
        s1.display();
        s2.display();

        BooleanBooleanValue b1= new BooleanBooleanValue();
        b1.check();

        BooleanCompare o1= new BooleanCompare();
        o1.checkCompare();
    }
}
