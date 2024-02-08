package org.Interview.gava8Tips.streamAPi;

import org.Interview.gava8Tips.DataBase;
import org.Interview.gava8Tips.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamingApi {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,7,5,8,9);
//        nums.forEach(n -> System.out.println(n));


//      Look at the data types and store that into a stream that has the same type
        Stream<Integer> dataStream = nums.stream();


// The forEach will pick up the data from the stream one by one
//        dataStream.forEach(n ->System.out.println(n));
//        but once you use it you cant us it again
//        dataStream.forEach(n -> System.out.println(n));

        Stream<Integer> sortedData = dataStream.sorted();
        sortedData.forEach(n -> System.out.println(n));





//-----------> footNotes
        // When working with lots of data or  multiple threads its always better to have
//       Immutable data which means dont change the existing value.
//        if you're going to process do so in a new stream

//        The advantages of using the stream you're not interacting with the orginal list
//        but once you use it you cant us it again


    }
}
