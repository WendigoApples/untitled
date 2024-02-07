package org.Interview.gava8Tips;

import java.util.ArrayList;
import java.util.List;
//DAO layer
public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000));
        list.add(new Employee(388, "Bikash", "CIVIL", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee(624, "Sourav", "CORE", 400000));
        list.add(new Employee(159, "James Brown", "SALES", 257271));
        list.add(new Employee(148, "John Rodriguez", "SALES", 407765));
        list.add(new Employee(112, "Michael Miller", "ENGINEERING", 253536));
        list.add(new Employee(133, "Thomas Taylor", "SALES", 600860));
        list.add(new Employee(136, "Matthew Smith", "CIVIL", 541865));
        list.add(new Employee(175, "Mark Jackson", "MARKETING", 984063));
        list.add(new Employee(160, "Richard Martin", "CIVIL", 692472));
        list.add(new Employee(102, "Christopher White", "SOCIAL", 361748));
        list.add(new Employee(172, "Robert Rodriguez", "IT", 342653));
        list.add(new Employee(126, "Charles Rodriguez", "CORE", 907495));
        return list;
    }

}