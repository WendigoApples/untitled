package org.Interview.gava8Tips;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;


public class MainRunner {


    public static void main(String[] args) {

        List<Employee> employees = Stream.of(
                new Employee(1, "Bob", "DEV", 990000),
                new Employee(2, "Jess", "QA", 78000),
                new Employee(3, "Ogla", "DEV", 88000),
                new Employee(4, "Frances", "DEV", 193000),
                new Employee(5, "Jeff", "QA", 4000000),
                new Employee(6, "Lizz", "MARKETING", 122000))
            .collect(Collectors.toList());


// ---->
        // Group list by department and print it out
//        Map<String, List<Employee>> employeeMapp = employees.stream().collect(groupingBy(Employee::getDept));
//        System.out.println(employeeMapp);
//
//        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
//        // Group list by department and print it out
//        Map<String, Optional<Employee>> employeeMap = employees.stream().
//                collect(
//                        groupingBy(Employee::getDept,
//                                Collectors.reducing(BinaryOperator.maxBy(compareBySalary)))
//                );
//        System.out.println(employeeMap);



        List<Employee> employeeSalary = DataBase.getEmployees();  //    Sort better this better
//        employees.forEach(n-> System.out.println(n));

        List<Employee> sortedBySalary = employeeSalary.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedBySalary.forEach(n -> System.out.println("\nEmployees sorted by ID: " + n));


//        List<Employee> ep = employees.


    }

}
