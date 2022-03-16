package overloadingandoverriding.covariant;

public class A {
    public A get(){
        return this;
    }

    void message(){System.out.println("welcome to covariant return type");}
}
