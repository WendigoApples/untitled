package org.Interview.gava8Tips;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UOIPayment {

    //Abstract method
     String doPayment(String source, String dest);


//----> No restruction on the amount of uses of the methods below

     // When using must provide implementation also by using default it will not force a override
    default double getScratchCard() {
        return new Random().nextDouble();
    }

    // Us static
    static String datePatterns(String patterns) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }


}
