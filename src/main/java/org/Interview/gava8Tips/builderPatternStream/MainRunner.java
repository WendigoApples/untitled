package org.Interview.gava8Tips.builderPatternStream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainRunner {


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,8,9);
        Stream<Integer> data = nums.stream();


//  Errors
//        long count = data.count();
//        System.out.println(count);
//        data.forEach(n -> System.out.println(n));  // // This will not work and will give the following error
//        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//        at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
//        at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
//        at org.Interview.gava8Tips.builderPatternStream.MainRunner.main(MainRunner.java:19)


        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2==1)
                    return true;
                else
                    return false;
            }

        };   // using an object of predicate
        nums.stream()
                .filter(predi)// only odd numbers
                .sorted()
                .map(n -> n * 2)
                .forEach((n -> System.out.println(n)));


        Predicate<Integer> pre = n -> n%2==1;   // lambda
        nums.stream()
                .filter(pre)
                .sorted()
                .map(n -> n * 2)
                .forEach((n -> System.out.println(n)));


// ----> without lambda and without using object less code
        nums.stream()
                .filter(n -> n%2==1 )// only odd numbers
                .sorted()
                .map(n -> n * 2) // double the number
                .forEach((n -> System.out.println(n)));



    }
}
