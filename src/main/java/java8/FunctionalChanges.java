package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalChanges{

    public static void main(String[] args) {
//        FIImpl obj = new FIImpl();
//        obj.hello();


        FI objFI = () -> {
            System.out.println("Hiii");
        };
        objFI.hello();


        // ***************************************************


        FIFunction obj2 = (x) -> {
          x = x+5;
          x=x*100;
          return x;
        };
        int value = obj2.hello(10);
        System.out.println(value);


        Function<Integer, Integer> function2 = (x) -> {
            x = x+5;
            x=x*100;
            return x;
        };
        System.out.println(function2.apply(10));

        // **************************************************

        MYPredicate obj3 = (x) -> {
            return true;
        };
        boolean value2 = obj3.hello(10);
        System.out.println(value2);


        Predicate<Integer> predicateJavaWala = (x) -> {
            return true;
        };
        boolean valueP = predicateJavaWala.test(10);
        System.out.println(valueP);


        // ****************

        MYCusotm myCusotm = (a, b, c) -> {
            return a+b+c;
        };
        myCusotm.hello(10,20,30);


        // *******

        // Consumer
        // Biconsumer
        // supplier
        //BIfunction

        // function
        //predicate
        //bipridicate

    }
}


@FunctionalInterface
interface FIFunction{

    int hello(int a);

}

@FunctionalInterface
interface MYPredicate{

    boolean hello(int a);

}


@FunctionalInterface
interface MYCusotm{

    int hello(int a, int b, int c);

}


@FunctionalInterface
interface FI{

    void hello();

}


//class FIImpl implements  FI{
//
//    @Override
//    public void hello() {
//        System.out.println("HIIII");
//    }
//}


