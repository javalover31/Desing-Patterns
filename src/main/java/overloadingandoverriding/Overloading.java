package overloadingandoverriding;

public class Overloading {
    public void display(short i, int j)
    {
        System.out.println("short and short");
    }

    public void display(int i, float j)
    {
        System.out.println("int and int");
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.display(63,85);
    }
}
