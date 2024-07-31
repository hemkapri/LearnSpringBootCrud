package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLearning {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> outputList = new ArrayList<>();
        for(Integer x : input){
            int y = x*10;
            outputList.add(y);
        }

        System.out.println(outputList);


        // ********************************

        List<Integer> outputListStream = new ArrayList<>();

//        outputListStream = input.stream().map((x) -> {
//            int y = x*10;
//            return y;
//        }).collect(Collectors.toList());

        outputListStream = input.stream().map((x) -> x*10).collect(Collectors.toList());

        System.out.println(outputListStream);





        // *************************

        System.out.println("******************");


        List<Integer> inputFilter = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> outputListFilter = new ArrayList<>();
        for(Integer x : input){
            if(x%2!=0) {
                outputListFilter.add(x);
            }
        }

        System.out.println(outputListFilter);

        List<Integer> outputListStreamFilter = inputFilter.stream().filter((x) -> x%2!=0).collect(Collectors.toList());

        System.out.println(outputListStreamFilter);

        System.out.println("******************");


        List<Integer> range = IntStream.rangeClosed(100, 200)
                .boxed().collect(Collectors.toList());

        List<Integer> rangeOut = range.stream().filter((x) -> x%2==0).collect(Collectors.toList());
        System.out.println(rangeOut);

        System.out.println(rangeOut.size());


        System.out.println("******************");

        List<Integer> unsortedList = Arrays.asList(1,4,11,2,56,3,45);

        List<Integer> sortedList = unsortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedList);



    }
}
