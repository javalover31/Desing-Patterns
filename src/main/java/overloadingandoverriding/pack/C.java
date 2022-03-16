package overloadingandoverriding.pack;

import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        int array[] = {2,5,4,8,5,6};

        String s = "ankitp";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(s.length());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(20);
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
