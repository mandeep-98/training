package second;

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

public class StaticClass extends BooleanCompare{
    public static void main(String[] args){
        student.change();
        student s1= new student("Mandeep",10);
        student s2= new student("Sandeep",20);
        s1.display();
        s2.display();
        BooleanCompare o1= new BooleanCompare();
        o1.checkCompare();
    }
}
