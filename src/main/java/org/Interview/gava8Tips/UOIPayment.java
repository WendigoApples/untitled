package org.Interview.gava8Tips;



import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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



    default void orderSalary() {
        List<Employee> employeeSalary = DataBase.getEmployees();
//        employees.forEach(n-> System.out.println(n));

        List<Employee> sortedBySalary = employeeSalary.stream().
                sorted(Comparator.comparingInt(Employee::getSalary).reversed()).
                collect(Collectors.toList());
        sortedBySalary.forEach(n -> System.out.println("\nEmployees sorted by ID: " + n));
    }

    default void accendingEmpIdNum(){

        List<Employee> employeeId = DataBase.getEmployees();
        List<Employee> sortedEmployeeId = employeeId.stream().
                sorted(Comparator.comparingInt(Employee::getId)).
                collect(Collectors.toList());
        sortedEmployeeId.forEach(n -> System.out.println("\nEmployees sorted by ID: " + n));

    }


}
