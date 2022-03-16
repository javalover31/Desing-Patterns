package overloadingandoverriding;

public class Inner {

    class Outer{ private int counter = 1;
        void display(){
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        Inner.Outer outer = inner.new Outer();
        outer.display();
        System.out.println(outer.counter);
    }
}
