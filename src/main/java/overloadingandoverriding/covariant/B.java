package overloadingandoverriding.covariant;

public class B extends A{
    public B get(){
        return this;
    }
    void message(){System.out.println("welcome to covariant return type 2");}

    public static void main(String[] args) {
       A a = new B();
       a.get().message();
    }
}
