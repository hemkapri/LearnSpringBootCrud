package Collection;

import java.util.ArrayList;

public class ExampleArray {

    public static void main(String[] args) {

        ArrayList<String> object = new ArrayList<>();
        object.add("Hem");
        object.add("Mukesh");
        object.add("Manisha");
        object.add("Geeta");
        System.out.println(object);
        object.add(2,"Kajal");
        System.out.println(object);
        boolean data = object.contains("Mukesh");
        System.out.println(data);
        String data1 = object.get(4);
        System.out.println(data1);
        int data2 = object.hashCode();
        System.out.println(data2);
        int data3 = object.size();
        System.out.println(data3);
        object.add("Mukesh");
        System.out.println(object);


        ArrayList<Integer> object1 = new ArrayList<>();
        object1.add(1);
        object1.add(2);
        System.out.println(object1);

    }

}
