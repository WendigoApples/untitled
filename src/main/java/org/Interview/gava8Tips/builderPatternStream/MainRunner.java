package org.Interview.gava8Tips.builderPatternStream;



import jdk.internal.classfile.Interfaces;
import org.Interview.gava8Tips.DataBase;
import org.Interview.gava8Tips.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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










    }
}
