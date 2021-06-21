package first;

interface first{
    void a();
    void b();
    static int m=2;
}


abstract class AbstractClass implements first {
    abstract void method1();
    static int var=3;
    public void a(){
        System.out.println("This is 'a' which is implemented from interface");
    }
}

class MainAbstract extends AbstractClass{
    void method1(){
        System.out.println("Here is the data of abstract method");
    }
    public void b(){
        System.out.println("This is 'b' which is inherited from Abstract CLass ");
    }
}

