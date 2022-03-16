package overloadingandoverriding.pack;

public class B {
    void diaplay(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new A();
        a.diaplay();
    }
}
