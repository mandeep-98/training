
package first;

class parent{
    int par=1;
    public void sub(){
        System.out.println("Heloo this is sub-method");
    }
}
class child extends parent{

}

public class FirstProgram {
    public static void main(String[] args){
        //System.out.println("Hello");
//        MainAbstract o1 = new MainAbstract();
//        o1.method1();
//        o1.a();
//        o1.b();
//        System.out.println("The value of variable is "+AbstractClass.var);
        parent p1= new parent();
        p1.sub();
        System.out.println("Interface static variable "+first.m);
    }
}
