package overloadingandoverriding.covariant.type;

import overloadingandoverriding.OverrisidngTwo;

public class OverridingTwo extends OverridingOne{

    public void display(ChiildService chiildService){
        System.out.println("two");
    }

    public static void main(String[] args) {
        OverridingTwo overridingOne = new OverridingTwo();
        overridingOne.display(new ChiildService());
    }
}
