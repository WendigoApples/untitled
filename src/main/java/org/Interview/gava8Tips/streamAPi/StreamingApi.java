package org.Interview.gava8Tips.streamAPi;

import org.Interview.gava8Tips.DataBase;
import org.Interview.gava8Tips.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamingApi {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,4,7,9,6,3);
//        nums.forEach(n -> System.out.println(n));


//      Look at the data types and store that into a stream that has the same type
        Stream<Integer> dataStream = nums.stream();


// The forEach will pick up the data from the stream one by one
//        dataStream.forEach(n ->System.out.println(n));
//        but once you use it you cant us it again
//        dataStream.forEach(n -> System.out.println(n));

//        Stream<Integer> sortedData = dataStream.sorted();
//        sortedData.forEach(n -> System.out.println(n));

//        Stream<Integer> smoothSort = nums.stream().sorted();
//        smoothSort.forEach(n -> System.out.println(n));


//  1 Double each object in stream
//       Stream<Integer> mappedData = dataStream.map(n -> n * 2);
//       mappedData.forEach(n -> System.out.println(n));

// // Example of lambda
//        for(int n : nums) {
//            System.out.println(n * 2);
//        }
// 2
//        Stream<Integer> mappedData = nums.stream().map(n -> n * 2);
//        mappedData.forEach(n -> System.out.println(n));
// 3

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
                .filter(n -> n%2==1 )// only odd numbers
                .sorted()
                .map(n -> n * 2)
                .forEach((n -> System.out.println(n)));

//-----------> footNotes
        // When working with lots of data or  multiple threads its always better to have
//       Immutable data which means dont change the existing value.
//        if you're going to process do so in a new stream

//        The advantages of using the stream you're not interacting with the orginal list
//        but once you use it you cant us it again


    }
}
