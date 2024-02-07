package org.Interview.gava8Tips.design;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import org.Interview.gava8Tips.Employee;


public class EmployeeBuilder {


        public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();

            // Original employees
            list.add(new Employee(176, "Roshan", "IT", 600000));
            list.add(new Employee(388, "Bikash", "CIVIL", 900000));
            list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
            list.add(new Employee(624, "Sourav", "CORE", 400000));
            list.add(new Employee(176, "Prakash", "SOCIAL", 1200000));

            // Generate 10 more employees
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int id = random.nextInt(1000) + 1000; // Generate ID between 1000 and 1999
                String name = generateRandomName();
                String department = generateRandomDepartment();
                int salary = random.nextInt(900000) + 100000; // Generate salary between 100000 and 999999
                list.add(new Employee(id, name, department, salary));
            }

            // Print all employees
            for (Employee employee : list) {
                System.out.println(employee);
            }
        }

        private static String generateRandomName() {
            String[] firstNames = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Charles", "Thomas", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven", "Andrew", "Kenneth"};
            String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson", "Thompson", "White"};
            Random random = new Random();
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            return firstName + " " + lastName;
        }

        private static String generateRandomDepartment() {
            String[] departments = {"IT", "CIVIL", "DEFENCE", "CORE", "SOCIAL", "SALES", "MARKETING", "HR", "FINANCE", "ENGINEERING"};
            Random random = new Random();
            return departments[random.nextInt(departments.length)];
        }


}
